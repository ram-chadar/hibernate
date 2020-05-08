package com.jbk.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Save_Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory ss=cfg.buildSessionFactory();
		Session sesn=ss.openSession();
		Transaction tx=sesn.beginTransaction();
		Student s=new Student();
//		
		s.setSid(10);
		s.setSname("pqr");
		
		sesn.save(s);
		System.out.println("Inserted..."+s.getSname());

		tx.commit();
		
	}

}
