package com.ram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Address address = new Address();
		address.setAddressId(1);
		address.setCity("pune");
		address.setPincode(411052);
		address.setState("Maharshtra");
		address.setAddressLine1("karve anagar");
		address.setCountry("India");
		
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId(1);
		employee1.setAddress(address);
		employee1.setEmail("harsh@gmail.com");
		employee1.setName("harsh");
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(2);
		employee2.setAddress(address);
		employee2.setEmail("ram@gmail.com");
		employee2.setName("ram");
		
		
		session.saveOrUpdate(employee1);
		session.saveOrUpdate(employee2);		
		tx.commit();

	}

}
