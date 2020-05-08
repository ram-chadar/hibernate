package com.jbk.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.jbk.crud.Student;

public class Max_Clause_Example {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory ss=cfg.buildSessionFactory();
	Session sesn=ss.openSession();
	Transaction tx=sesn.beginTransaction();
	
	//MAX CLAUSE
	Criteria cr=sesn.createCriteria(Student.class);
	ProjectionList projlist=Projections.projectionList();
	projlist.add(Projections.max("sid"));
	cr.setProjection(projlist);
	List result=cr.list();
	System.out.println("MAX ID="+result);
	
	
	
}
}
