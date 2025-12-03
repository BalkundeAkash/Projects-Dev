package com.example.demo.service;

public class PDFDocumentServiceImpl implements DocumentService {

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading data from Database");
		
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data for PDF");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		return "pdf";
	}

}
