package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ram.Contract_Employee;
import com.ram.Employee;
import com.ram.Regular_Employee;

public class Save {
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		    
		        
		    Regular_Employee re=new Regular_Employee();    
		    re.setName("Ram Chadar");    
		    re.setSalary(50000);    
		    re.setBonus(5);    
		        
		    Contract_Employee ce=new Contract_Employee();    
		    ce.setName("Amol Bansode");    
		    ce.setPay_per_hour(1000);    
		    ce.setContract_duration("15 hours");    
		     
		    session.persist(re);    
		    session.persist(ce);    
		        
		    transaction.commit();    
		    session.close();    
		    System.out.println("success");    
	}
}
