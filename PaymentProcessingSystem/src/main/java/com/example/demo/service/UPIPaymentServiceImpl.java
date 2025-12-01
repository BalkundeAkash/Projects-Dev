package com.example.demo.service;

public class UPIPaymentServiceImpl implements PaymentService {

	@Override
	public String processPayment(double amount) {
		// TODO Auto-generated method stub
		return "UPI payment of : " + amount + "processed sucessfully";
	}

}
