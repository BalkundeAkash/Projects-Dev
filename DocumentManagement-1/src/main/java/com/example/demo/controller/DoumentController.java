package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.PdfDocumentServiceImpl;
import com.example.demo.service.WordDocuemntServiceImpl;

@RestController
public class DoumentController {

	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type) {

		DocumentService ds = Factory.createObject(type);

		ds.readData();
		ds.processData();
		return ds.printData();

	}

}

class Factory {

	public static DocumentService createObject(String type) {

		if (type.equals("pdf")) {
			return new PdfDocumentServiceImpl();
		}
		if (type.equals("word")) {
			return new WordDocuemntServiceImpl();
		}
		return null;

	}

}
