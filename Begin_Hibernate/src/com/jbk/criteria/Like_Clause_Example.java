package com.jbk.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.jbk.crud.Student;

public class Like_Clause_Example {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory ss=cfg.buildSessionFactory();
	Session sesn=ss.openSession();
	Transaction tx=sesn.beginTransaction();
	
	Criteria cr=sesn.createCriteria(Student.class);
	cr.add(Restrictions.like("sname","%a%",MatchMode.ANYWHERE));
	List<Student> result=cr.list();
	for(Student o:result)
	{
		System.out.println(o.getSname());
	}
	/*System.out.println("---->GREATER THAN<----");
	cr.add(Restrictions.gt("sid",2));
	List<Student> result2=cr.list();
	for(Student o:result2)
	{
		System.out.println(o.getSid());
	}
	
	// To get records having sid more than 3
cr.add(Restrictions.gt("sid", 3));

// To get records having sid less than 3
cr.add(Restrictions.lt("sid", 3));

// To get records having snameame starting with p
cr.add(Restrictions.like("sname", "p%"));

// Case sensitive form of the above restriction.
cr.add(Restrictions.ilike("sname", "p%"));

// To get records having sid in between 2 and 10
cr.add(Restrictions.between("sid", 2, 10));

// To check if the given property is null
cr.add(Restrictions.isNull("sid"));

// To check if the given property is not null
cr.add(Restrictions.isNotNull("sid"));

// To check if the given property is empty
cr.add(Restrictions.isEmpty("sid"));

// To check if the given property is not empty
cr.add(Restrictions.isNotEmpty("sid"));*/

}
}
