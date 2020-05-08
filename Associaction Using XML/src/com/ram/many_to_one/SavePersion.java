package com.ram.many_to_one;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ram.model.AddressManyToOne;
import com.ram.model.PersionManyToOne;
import com.ram.util.HibernateUtil;

public class SavePersion {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		AddressManyToOne address=new AddressManyToOne(2, "latur", "latur", "MH");
		PersionManyToOne p=new PersionManyToOne(3, "Vaibhav", 20, address);
		session.save(p);
		tx.commit();
	}

}
