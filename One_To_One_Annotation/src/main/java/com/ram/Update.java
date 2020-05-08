package com.ram;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student student=session.load(Student.class, 1);
		
		student.setName("sham");
		Address address=session.load(Address.class, student.getAddress().getAid());
		address.setState("Maharashtra");
		student.setAddress(address);
		session.update(student);
		tx.commit();
	}

}
