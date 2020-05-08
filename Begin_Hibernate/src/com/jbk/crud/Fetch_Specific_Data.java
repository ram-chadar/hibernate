package com.jbk.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Fetch_Specific_Data 
{
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory ss=cfg.buildSessionFactory();
	Session sesn=ss.openSession();
	//Transaction tx=sesn.beginTransaction();
	
	Student s1=new Student(); // but first override toString() method in Emp.java (pojo class)
//	and there get id and empname otherwise it return hashcode
	s1=(Student)sesn.get(Student.class,1);

	System.out.println(s1);
}
}
