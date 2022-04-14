package com.kk.loan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Setter;
import lombok.ToString;

@Entity
@Setter @ToString
public class Loan {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loan_number")
	private int loanNumber;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name="start_dt")
	private Date startDt;
	
	@Column(name = "loan_type")
	private String loanType;
	
	@Column(name = "total_loan")
	private int totalLoan;
	
	@Column(name = "amount_paid")
	private int amountPaid;
	
	@Column(name = "outstanding_amount")
	private int outstandingAmount;
	
	@Column(name = "create_dt")
	private String createDt;
	
	public int getAmountPaid() {
		return amountPaid;
	}
	
	public String getCreateDt() {
		return createDt;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public int getLoanNumber() {
		return loanNumber;
	}
	public String getLoanType() {
		return loanType;
	}
	
	public int getOutstandingAmount() {
		return outstandingAmount;
	}
	
	public int getTotalLoan() {
		return totalLoan;
	}
	
	public Date getStartDt() {
		return startDt;
	}
	
	
}
