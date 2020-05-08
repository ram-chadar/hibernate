package com.ram;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student std=session.load(Student.class, 1);
		session.delete(std);
		tx.commit();
	}
}
