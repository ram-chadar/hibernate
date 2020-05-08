package com.ram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		Student std = new Student();
		std.setSid(2);
		std.setRollno(102);
		std.setName("amol");

		Address address = new Address();
		address.setAid(2);
		address.setCity("pune");
		address.setState("MH");
		address.setCountry("Ind");
		address.setStudent(std);

		std.setAddress(address);

		session.save(std);
		tx.commit();

	}

}
