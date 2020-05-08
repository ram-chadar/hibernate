package com.jbk.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdate_Test {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory ss=cfg.buildSessionFactory();
	Session sesn=ss.openSession();
	Transaction tx=sesn.beginTransaction();
	
	String val="replaced";
	Student s=new Student(1,val);//
	sesn.saveOrUpdate(s);
	System.out.println("update record where id="+s.getSid()+"..value="+val);
	tx.commit();
}
}
