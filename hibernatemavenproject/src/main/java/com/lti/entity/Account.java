package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_account")
public class Account {
	@Id
	@GeneratedValue
	@Column(name = "Account_No")
	private int accNo;

	@Column (name = "Balance")
	private double bal;

	@Column (name = "Card_No")
	private int cardNo;

	@Column (name = "Customer_Id")
	private int custId;
	
	@OneToOne
	@JoinColumn(name = "Customer_Id")
	private Customer cust;




	public int getAccNo() {
	return accNo;
	}



	public void setAccNo(int accNo) {
	this.accNo = accNo;
	}



	public double getBal() {
	return bal;
	}



	public void setBal(double bal) {
	this.bal = bal;
	}



	public int getCardNo() {
	return cardNo;
	}



	public void setCardNo(int cardNo) {
	this.cardNo = cardNo;
	}



	public int getCustId() {
	return custId;
	}



	public void setCustId(int custId) {
	this.custId = custId;
	}



	@Override
	public String toString() {
	return "Account [accNo=" + accNo + ", bal=" + bal + ", cardNo=" + cardNo + ", custId=" + custId + "]";
	}


}
