package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankService {

	@GetMapping("/login")
	String dashBoard() {
		//logic
		return "Welcome to ICICI bank";
	}

	@GetMapping("/deposite/{acNo}/{amount}")
	String deposite(@PathVariable int acNo, @PathVariable int amount) {
		//logic
		return "Your Amount is Deposited";
	}

	@GetMapping("checkBal/{acNo}/{pin}")
	int checkBalnce(@PathVariable int acNo, @PathVariable int pin) {
		//logic
		return 10000;
	}

}
