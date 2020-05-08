package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
	SessionFactory sf=	cfg.buildSessionFactory();
	Session session=sf.openSession();
	
	Transaction tx=session.beginTransaction();
	
	Student std=new Student();
	std.setRollno(101);
	std.setName("jbk");
	
	Address address=new Address();
	address.setCity("pune");
	address.setState("MH");
	address.setCountry("Ind");
	address.setStudent(std);
	
	std.setAddress(address);
	
	session.save(std);
	tx.commit();
		
	}

}
