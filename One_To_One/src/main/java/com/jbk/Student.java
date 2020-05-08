package com.jbk;

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
public class Student {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int sid;
	
	@Column
	private int rollno;
	
	@Column
	private String name;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL )
	private Address address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, int rollno, String name) {
		super();
		this.sid = sid;
		this.rollno = rollno;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	

}
