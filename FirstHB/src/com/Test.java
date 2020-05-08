package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sesn=sf.openSession();
		Transaction tr=sesn.beginTransaction();
		
		Student std=new Student();
		std.setSid(2);
		std.setSname("amol");
		std.setSage("23");
		
		sesn.save(std);
		tr.commit();
		System.out.println("inserted");
		
		
		
		
	}

}
