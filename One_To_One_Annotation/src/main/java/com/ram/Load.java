package com.ram;

import org.hibernate.Session;

public class Load {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
	Student std=	session.load(Student.class, 1);
	System.out.println(std);
	
	
	
	}

}
