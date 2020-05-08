package com.ram.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
@AttributeOverrides(
		{
			@AttributeOverride(name="id",column=@Column(name="id")),
			@AttributeOverride(name="name",column=@Column(name="name"))
			
		}
		)

public class Student extends Person{

	private int rollNo;
	private float marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
}
