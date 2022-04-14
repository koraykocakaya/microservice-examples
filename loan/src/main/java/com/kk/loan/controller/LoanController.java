package com.kk.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kk.loan.model.Customer;
import com.kk.loan.model.Loan;
import com.kk.loan.repository.LoanRepository;

@RestController
public class LoanController {

	@Autowired
	LoanRepository loanRepository;
	
	@PostMapping("/myLoans")
	public List<Loan> getLoanDetails(@RequestBody Customer customer){
		List<Loan> loanList = loanRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
		return loanList;
	}
}
