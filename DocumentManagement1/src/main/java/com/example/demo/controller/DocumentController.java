package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.PDFDocumentServiceImpl;
import com.example.demo.service.excelDocumentServiceImpl;
import com.example.demo.service.wordDocumentServiceImpl;

@RestController
public class DocumentController {
	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		DocumentService ds = null;
		
		if(type.equals("pdf"))
		{
			ds = new PDFDocumentServiceImpl();
		}
		
		if(type.equals("word"))
		{
			ds = new wordDocumentServiceImpl();
		}
		if(type.equals("excel"))
		{
			ds = new excelDocumentServiceImpl();
		}
		
		ds.readData();
		ds.processData();
		
		return ds.printData();
	}

}
