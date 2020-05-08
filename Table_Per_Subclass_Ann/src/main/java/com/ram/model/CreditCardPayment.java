package com.ram.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name="pid")
public class CreditCardPayment extends Payment {
		
	private int c_c_Number;
	private String creditCardType;
	
	public CreditCardPayment() {
		// TODO Auto-generated constructor stub
	}

	public int getC_c_Number() {
		return c_c_Number;
	}

	public void setC_c_Number(int c_c_Number) {
		this.c_c_Number = c_c_Number;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	
	

}
