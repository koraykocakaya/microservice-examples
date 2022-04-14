package com.kk.account.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Setter;
import lombok.ToString;

@Entity
@Setter @ToString
public class Account {

	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "account_number")
	@Id
	private long accountNumber;
	
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "branch_address")
	private String branchAddress;
	
	@Column(name = "create_dt")
	private LocalDate createDt;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public String getBranchAddress() {
		return branchAddress;
	}
	
	public LocalDate getCreateDt() {
		return createDt;
	}
	
	public int getCustomerId() {
		return customerId;
	}
}
