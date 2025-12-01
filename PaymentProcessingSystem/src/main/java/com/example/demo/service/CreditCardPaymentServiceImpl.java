package com.example.demo.service;

public class CreditCardPaymentServiceImpl implements PaymentService {

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		return "Credit Card Payment of : " + amount + "processed sucessfully";
	}

}
