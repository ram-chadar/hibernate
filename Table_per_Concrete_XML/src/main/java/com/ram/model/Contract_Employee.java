package com.ram.model;

public class Contract_Employee extends Employee{
	
	private double pay_per_hour;
	private String contract_duration;
	
	public Contract_Employee() {
		// TODO Auto-generated constructor stub
	}

	public double getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(double pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	

}
