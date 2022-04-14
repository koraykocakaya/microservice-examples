package com.kk.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kk.account.model.Account;
import com.kk.account.model.Customer;
import com.kk.account.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	AccountRepository accountRepository;
	
	@PostMapping (value = "/myAccount")
	public Account getAccountDetail(@RequestBody Customer customer) {
		
		Account account = accountRepository.findByCustomerId(customer.getCustomerId());
		return account;
		
	}
}
