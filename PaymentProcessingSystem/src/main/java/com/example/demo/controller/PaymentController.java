package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CreditCardPaymentServiceImpl;
import com.example.demo.service.NetBankingPaymentServiceImpl;
import com.example.demo.service.PaymentService;
import com.example.demo.service.UPIPaymentServiceImpl;

@RestController
public class PaymentController {

	@GetMapping("pay/{mode}/{amount}")
	public String makePayment(@PathVariable String  mode, @PathVariable double amount)
	{
		PaymentService ps = null;
		
		if(mode.equals("card"))
		{
			ps = new CreditCardPaymentServiceImpl();
		}
		if(mode.equals("upi"))
		{
			ps = new UPIPaymentServiceImpl();
		}
		if(mode.equals("net"))
		{
			ps = new NetBankingPaymentServiceImpl();
		}
		
		
		return ps.paymentProcess(amount);
		
		
	}
}
