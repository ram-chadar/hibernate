package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QuertTest {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sesn=sf.openSession();
		
		Query qry=sesn.createQuery("from Employee");
		List<Employee> list=qry.list();
		
		for(Employee emp:list)
		{
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();
		}
		System.out.println("************ few propertiese ( Where clause ) *********");
		
		Query q1=sesn.createQuery("FROM Employee E WHERE E.id = 3");
		List<Employee>l1=q1.list();
		for(Employee emp:l1)
		{
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();
			
		}
		
		System.out.println("********** Order BY *********");
		Query q2=sesn.createQuery("from Employee order by name");
		List<Employee>l2=q2.list();
		for(Employee emp:l2)
		{
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();
		}
		
		System.out.println("********** Group BY *********");
		Query q3=sesn.createQuery("from Employee group by salary");
		List<Employee>l3=q3.list();
		for(Employee emp:l3)
		{
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();
		}
		
		System.out.println("************ Using Named Parameters ************");
		
		Query q4 = sesn.createQuery("from Employee where id=:eid");
		q4.setParameter("eid",56);
		List<Employee> l4 = q4.list();
		int result=0;
		for(Employee emp:l4)
		{
			result++;
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();	
		}
		if(result==0)
		{
			System.out.println("No Any Record");
		}
		
		Query q5=sesn.createQuery("update Employee set name=:ename,salary=:esalary where id=:eid");
		q5.setParameter("ename","updated ram");
		q5.setParameter("esalary", 12345);
		q5.setParameter("eid", 3);
		int result2=q5.executeUpdate();
		if(result2>0)
		{
			System.out.println("Updated successfully");
		}
		else
		{
			System.out.println("Not Updated");
		}
		
		
		/*
		 pagination
		  1.qry.setMaxResults(2);
		  2.qry.setFirstResult(3);
		 * */
		
	}
 
}
