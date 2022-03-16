package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_tranasaction")
public class Transaction_Table {
	
	@Id
	@GeneratedValue
	@Column(name = "Trans_Id")
	private int transid;
	
	@Column(name = "AccountNo")
	private int accno;
	
	@Column(name = "Amount")
	private int amt;
	
	@Column(name = "Balance")
	private double bal;
	
	@Column(name = "Date_Time")
	private LocalDate datetime;
	
	@OneToMany
	@JoinColumn(name = "Account_No")
	private Account acc;

	public int getTransid() {
		return transid;
	}

	public void setTransid(int transid) {
		this.transid = transid;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public LocalDate getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDate datetime) {
		this.datetime = datetime;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
	
	
	

}
