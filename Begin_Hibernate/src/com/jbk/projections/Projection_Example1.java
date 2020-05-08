package com.jbk.projections;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.jbk.crud.Student;

public class Projection_Example1 {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session sesn=sf.openSession();
	
	Criteria cr=sesn.createCriteria(Student.class);
	
	cr.setProjection(Projections.property("sname"));
	
	List l=cr.list();
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		String s=(String)it.next();
		System.out.println(s);
		
	}
	
	System.out.println("----------------------------------------");
	
    cr.setProjection(Projections.property("sid"));
	List l1=cr.list();
	Iterator it1=l1.iterator();
	while(it1.hasNext())
	{
		Integer d=(Integer)it1.next();
		System.out.println(d);
	}
	

}
}
