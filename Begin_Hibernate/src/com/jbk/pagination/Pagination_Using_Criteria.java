package com.jbk.pagination;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.crud.Student;

public class Pagination_Using_Criteria {
public static void main(String[] args) 
{
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session sesn=sf.openSession();
	
	Criteria cr=sesn.createCriteria(Student.class);
	
	cr.setFirstResult(2);  //in database table first row starting with 0 index
	cr.setMaxResults(10);
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
