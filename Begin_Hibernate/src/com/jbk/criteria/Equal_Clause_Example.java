package com.jbk.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.jbk.crud.Student;

import java.util.Iterator;
import java.util.List;

public class Equal_Clause_Example {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory ss=cfg.buildSessionFactory();
	Session sesn=ss.openSession();
	
	//Transaction tx=sesn.beginTransaction();
	
	Criteria cr=sesn.createCriteria(Student.class);
	cr.add(Restrictions.eq("sid",1));
	List<Student> result=cr.list();
	
	for ( Student p: result) {
		
		System.out.println(p.getSname()+"...Where id=1");
	
		
	}	
}
}
