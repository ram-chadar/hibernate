package com.jbk.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Address_Id;

@Column
private String address_line1;

@Column
private String city;

@Column
private String State;

@Column
private String country;

@Column
private int pincode;

@OneToOne(targetEntity=Employee.class)
private Employee employee;

public Address(String address_line1, String city, String state, String country, int pincode, Employee employee) {
	super();
	this.address_line1 = address_line1;
	this.city = city;
	State = state;
	this.country = country;
	this.pincode = pincode;
	this.employee = employee;
}

public Address() {
	// TODO Auto-generated constructor stub
}

public int getAddress_Id() {
	return Address_Id;
}

public void setAddress_Id(int address_Id) {
	Address_Id = address_Id;
}

public String getAddress_line1() {
	return address_line1;
}

public void setAddress_line1(String address_line1) {
	this.address_line1 = address_line1;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}



public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

}
