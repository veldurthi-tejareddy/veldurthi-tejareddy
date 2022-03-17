package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table (name = "tbl_fund_transfer")
public class Fund_Transfer {
	
	@Id
	@GeneratedValue
	@Column(name = "Pay_Id")
	private int payId;
	
	@Column(name = "Pay_Name")
	private String payName;
	
	@Column(name = "Pay_Accno")
	private int payAccno;
	
	@Column(name = "Account_No")
	private int accountno;

	
	@ManyToOne
	@JoinColumn(name = "Account_No")
	private Account acc;
	
	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public int getPayAccno() {
		return payAccno;
	}

	public void setPayAccno(int payAccno) {
		this.payAccno = payAccno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	
	


	
	
}
