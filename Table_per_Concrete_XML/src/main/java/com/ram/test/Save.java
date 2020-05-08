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

		Configuration cfg=new Configuration().configure(); 
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee employee =new Employee();
		employee.setName("Ram Chadar");
		
		Regular_Employee regular_Employee=new Regular_Employee();
		regular_Employee.setName("Amol Bansode");
		regular_Employee.setSalary(50000);
		regular_Employee.setBonus(400);
		
		Contract_Employee contract_Employee=new Contract_Employee();
		contract_Employee.setName("Yog");
		contract_Employee.setPay_per_hour(1000);
		contract_Employee.setContract_duration("8 month");
		
		session.save(employee);
		session.save(contract_Employee);
		session.save(regular_Employee);
		
		transaction.commit();
	}

}
