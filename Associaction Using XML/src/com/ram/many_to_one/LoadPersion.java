package com.ram.many_to_one;

import org.hibernate.Session;

import com.ram.model.PersionManyToOne;
import com.ram.util.HibernateUtil;

public class LoadPersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Session session=HibernateUtil.getSessionFactory().openSession();
	
PersionManyToOne p=session.load(PersionManyToOne.class, 2);
System.out.println(p);
	}

}
