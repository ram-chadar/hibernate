package com.ram.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ram.model.Contract_Employee;
import com.ram.model.Employee;
import com.ram.model.Regular_Employee;

public class Save {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		Employee employee=new Employee(1, "Ram");
		
		Regular_Employee regular_Employee=new Regular_Employee();
		regular_Employee.setName("Amol");
		regular_Employee.setSalary(25000);
		regular_Employee.setBonus(2000);
		
		Contract_Employee contract_Employee=new Contract_Employee();
		contract_Employee.setName("Yog");
		contract_Employee.setPay_per_hour(100);
		contract_Employee.setContract_duration("8 month");
		
		session.save(employee);
		session.save(regular_Employee);
		session.save(contract_Employee);
		
		transaction.commit();
		System.out.println("saved");
	}

}
