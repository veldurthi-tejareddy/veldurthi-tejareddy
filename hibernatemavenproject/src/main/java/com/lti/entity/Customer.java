package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "Customer_Id")
	private int customerId;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Mobile_No")
	private int mobileNo;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "DateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name = "Adhar_Card")
	private int adharcard;
	
	@OneToOne
	@JoinColumn(name = "Account_No")
	private Account acc;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(int adharcard) {
		this.adharcard = adharcard;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	
	
	

}
