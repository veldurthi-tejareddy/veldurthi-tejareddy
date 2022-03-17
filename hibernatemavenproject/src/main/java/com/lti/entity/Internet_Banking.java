package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_internetbanking")
public class Internet_Banking {
	
	@Id
	@GeneratedValue
	@Column(name = "Login_Id")
	private String logid;
	
	@Column(name = "Login_Pass")
	private String logipass;
	
	@Column(name = "Tranascation_Pass")
	private String transpass;
	
	@Column(name = "Account_No")
	private int accountno;
	
	
	@OneToOne
	@JoinColumn(name = "Account_No")
	private Account acc;

	public String getLogid() {
		return logid;
	}

	public void setLogid(String logid) {
		this.logid = logid;
	}

	public String getLogipass() {
		return logipass;
	}

	public void setLogipass(String logipass) {
		this.logipass = logipass;
	}

	public String getTranspass() {
		return transpass;
	}

	public void setTranspass(String transpass) {
		this.transpass = transpass;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	
	
	
	

}
