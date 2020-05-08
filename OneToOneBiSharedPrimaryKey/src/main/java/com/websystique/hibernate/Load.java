package com.websystique.hibernate;

import org.hibernate.Session;

import com.websystique.hibernate.model.Student;

public class Load {

	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student student=(Student) session.load(Student.class, new Long(1));
		
		System.out.println(student);
	}

}
