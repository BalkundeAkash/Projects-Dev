package com.example.demo.service;

public class PdfDocumentServiceImpl implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading Data from the Database");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing Data for PDF");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing Data");
		return "pdf";
	}

}
