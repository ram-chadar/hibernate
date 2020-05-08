package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sesn=sf.openSession();
		
		System.out.println("********* Restriction eq ********");
		Criteria crt=sesn.createCriteria(Employee.class);
		crt.add(Restrictions.eq("salary", "2333"));
		List<Employee>list1=crt.list();
		for(Employee emp:list1)
		{
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();
		}
		
		System.out.println("********* Restriction bet ********");
		Criteria crt2=sesn.createCriteria(Employee.class);
		//crt2.add(Restrictions.between("id", 1, 3));
		
		List<Employee>list2=crt2.list();
		for(Employee emp:list2)
		{
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();
		}
		System.out.println("***********");
		//list2=sesn.createCriteria(Employee.class).addOrder(Order.desc("name")).list();
		
		list2=sesn.createCriteria(Employee.class).add(Restrictions.like("name","%am%")).list();
		for(Employee emp:list2)
		{
			System.out.print(emp.getId()+"\t");
			System.out.print(emp.getName()+"\t");
			System.out.print(emp.getSalary()+"\t");
			System.out.println();
		}
		
	}

}
