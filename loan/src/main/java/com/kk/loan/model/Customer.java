package com.kk.loan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Setter;
import lombok.ToString;

@Entity
@Setter @ToString
public class Customer {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	@Id
	private int customerId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "create_dt")
	private LocalDate createDt;
	
	
	public LocalDate getCreateDt() {
		return createDt;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public String getName() {
		return name;
	}
	
}
