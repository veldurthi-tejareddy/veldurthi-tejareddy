package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_Open_Account")
public class OpenAccount {
	
	@Id
	@GeneratedValue
	@Column(name = "Acc_Id")
	private int accid;
	
	@Column(name = "Password")
	private String password;
	
	@Column (name = "Tx_Pass")
	private String txpass;
	
	@OneToOne
	@JoinColumn(name = "Account_No")
	private Account acc;

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTxpass() {
		return txpass;
	}

	public void setTxpass(String txpass) {
		this.txpass = txpass;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	
	
	
	
	

}
