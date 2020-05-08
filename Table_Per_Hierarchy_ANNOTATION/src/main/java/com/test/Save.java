package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Bike;
import com.model.Car;
import com.model.Vehicle;

public class Save {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		Bike bike=new Bike();
		bike.setCompany("Honda");
		bike.setColor("black");
		bike.setName("Splendar");
		bike.setWheel(2);
		
		Car car=new Car();
		car.setCompany("Honda");
		car.setColor("Red");
		car.setName("Honda civic");
		car.setWheel(4);
		
		session.saveOrUpdate(car);	
		session.saveOrUpdate(bike);
		transaction.commit();
		System.out.println("saved");
	}

}
