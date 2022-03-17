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
@Table(name = "tbl_account")
public class Account {
	@Id
	@GeneratedValue
	@Column(name = "Account_No")
	private int accNo;

	@Column(name = "Title")
	private String title;

	@Column(name = "FirstName")
	private String fname;

	@Column(name = "MiddleName")
	private String mname;

	@Column(name = "LastName")
	private String lname;

	@Column(name = "MobNo")
	private int mobno;

	@Column(name = "Email")
	private String email;

	@Column(name = "AddharCard")
	private int addcard;

	@Column(name = "DateOfBirth")
	private LocalDate dob;

	@Column(name = "Address")
	private String add;

	@Column(name = "City")
	private String city;

	@Column(name = "PinCode")
	private int pincode;

	@Column(name = "DebitCard")
	private int decard;

	@Column(name = "NetBanking")
	private String netbank;

	@Column(name = "Balance")
	private double bal;

	@Column(name = "Approval")
	private String app;

	@OneToOne
	@JoinColumn(name = "Acc_Id")
	private  OpenAccount opacc;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAddcard() {
		return addcard;
	}

	public void setAddcard(int addcard) {
		this.addcard = addcard;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getDecard() {
		return decard;
	}

	public void setDecard(int decard) {
		this.decard = decard;
	}

	public String getNetbank() {
		return netbank;
	}

	public void setNetbank(String netbank) {
		this.netbank = netbank;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	

}
