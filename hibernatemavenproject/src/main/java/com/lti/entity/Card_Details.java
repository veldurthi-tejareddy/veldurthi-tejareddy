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
@Table (name = "tbl_card_details")
public class Card_Details {

	@Id
	@GeneratedValue
	@Column(name = "Card_No")
	private int cardno;
	
	@Column(name = "Issue_Date")
	private LocalDate issueDate;
	
	@Column(name = "Expiry_Date")
	private LocalDate expiry_Date;
	
	@OneToMany
	@JoinColumn(name = "Account_No")
	private Account acc;

	public int getCardno() {
		return cardno;
	}

	public void setCardno(int cardno) {
		this.cardno = cardno;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiry_Date() {
		return expiry_Date;
	}

	public void setExpiry_Date(LocalDate expiry_Date) {
		this.expiry_Date = expiry_Date;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
	
}
