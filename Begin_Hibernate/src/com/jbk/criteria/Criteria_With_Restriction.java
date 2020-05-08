package com.jbk.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.jbk.crud.Student;

public class Criteria_With_Restriction {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();

	Session sesn=sf.openSession();
	
	Criteria cr=sesn.createCriteria(Student.class);
	
	cr.add(Restrictions.gt("sid", 2));
	cr.add(Restrictions.like("sname","%pqr%"));

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
