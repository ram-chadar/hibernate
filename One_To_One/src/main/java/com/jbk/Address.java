package com.jbk;

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
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String country;
	
	@OneToOne(targetEntity=Student.class)
	private Student student;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, String city, String state, String country, Student student) {
		super();
		this.aid = aid;
		this.city = city;
		this.state = state;
		this.country = country;
		this.student = student;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
