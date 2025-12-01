package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelDocuementServiceImpl;
import com.example.demo.service.PdfDocumentServiceImpl;
import com.example.demo.service.WordDocumentServiceImpl;

@RestController
public class DocumentController {

	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type) {
		DocumentService documentService = null;

		if (type.equals("pdf")) {
			documentService = new PdfDocumentServiceImpl();
		}
		if (type.equals("word")) {
			documentService = new WordDocumentServiceImpl();
		}
		if (type.equals("excel")) {
			documentService = new ExcelDocuementServiceImpl();
		}

		documentService.readData();
		documentService.processData();
		return documentService.printData();
	}
}
