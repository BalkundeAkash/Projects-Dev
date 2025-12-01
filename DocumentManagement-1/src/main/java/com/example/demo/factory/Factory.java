package com.example.demo.factory;

import com.example.demo.service.DocumentService;

import com.example.demo.service.PdfDocumentServiceImpl;
import com.example.demo.service.WordDocuemntServiceImpl;

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

