package com.jbk.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jbk.bean.Address;
import com.jbk.bean.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		//Save
		Employee employee=new Employee();
		employee.setFirst_Name("Ram");
		employee.setLast_Name("Chadar");
		employee.setEmail("ram@gmail.com");
		Address address = new Address();
		address.setAddress_line1("Karvenagar,pune");
		address.setCity("Pune");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPincode(411052);
		
		address.setEmployee(employee);
		employee.setAddress(address);
		
		session.save(employee);
		tx.commit();
		System.out.println("Record saved successfully!!!!!!");
	}

}
