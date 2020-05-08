package com.ram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	
	private String accHolder;
	private double amount;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int pid, String accHolder, double amount) {
		super();
		this.pid = pid;
		this.accHolder = accHolder;
		this.amount = amount;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	

}
