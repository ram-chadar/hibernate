package com.jbk.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Delete_Test 
{
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session sesn=sf.openSession();
	//Transaction tx=sesn.beginTransaction();
	
	Object o=sesn.load(Student.class, 3);
	Student ss=(Student)o;
	sesn.delete(ss);
	
	System.out.println("record deleted where id="+ss.getSid());
}
}
