package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHiber {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session sesn=sf.openSession();
	Transaction tx=sesn.beginTransaction();
	
	//Employee emp=new Employee(7,"jbkjbk","321456");
	
	//sesn.save(emp);
	//tx.commit();
Query q=sesn.createQuery("from Employee");

List<Employee> l=q.list();

for(Employee e:l)
{
	System.out.print(e.getId()+"\t");
	System.out.print(e.getName()+"\t");
	System.out.print(e.getSalary()+"\t");
	System.out.println();
}
	
	
		
		
	}

}
