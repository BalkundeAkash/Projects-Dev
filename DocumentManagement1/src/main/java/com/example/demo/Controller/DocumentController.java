package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelDocumentServiceImpl;
import com.example.demo.Service.PdfDocumentServiceImpl;
import com.example.demo.Service.WordDocumentServiceImpl;

@RestController
public class DocumentController {

	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		
		DocumentService DS = null;
		
		if(type.equals("pdf"))
		{
			DS = new PdfDocumentServiceImpl();
		}
		
		if(type.equals("word"))
		{
			DS = new WordDocumentServiceImpl();
		}
		
		if(type.equals("Excel"))
		{
			DS = new ExcelDocumentServiceImpl();
		}
		
		
		DS.readData();
		DS.processData();
		return DS.printData();
		
		
	}
}
