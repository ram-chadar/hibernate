package com.jbk.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

import com.jbk.crud.Student;

public class OrderExample {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory ss=cfg.buildSessionFactory();
	Session sesn=ss.openSession();
	Transaction tx=sesn.beginTransaction();
	Query query = sesn.createQuery("select sid,sname from Student");
	
	Criteria cr=sesn.createCriteria(Student.class);
	
	cr.addOrder(Order.asc("sname"));
	
	List l=cr.list();
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		Student s=(Student)it.next();
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		
	}
	
}

}
