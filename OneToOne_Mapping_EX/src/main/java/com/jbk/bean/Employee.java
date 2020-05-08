package com.jbk.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column
@PrimaryKeyJoinColumn
private int Emp_Id;

@Column
private String First_Name;

@Column
private String Last_Name;

@Column
private String Email;

@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
private Address address;

public Employee(String first_Name, String last_Name, String email, Address address) {
	super();
	First_Name = first_Name;
	Last_Name = last_Name;
	Email = email;
	this.address = address;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public int getEmp_Id() {
	return Emp_Id;
}
public void setEmp_Id(int emp_Id) {
	Emp_Id = emp_Id;
}
public String getFirst_Name() {
	return First_Name;
}
public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}
public String getLast_Name() {
	return Last_Name;
}
public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
