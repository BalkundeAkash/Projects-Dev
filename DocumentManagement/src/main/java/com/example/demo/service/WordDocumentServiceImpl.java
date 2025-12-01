package com.example.demo.service;

public class WordDocumentServiceImpl implements DocumentService {

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading Data fromt the Database");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing Data for Word");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing Data");
		return "word";
	}

}
