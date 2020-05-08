package com.ram.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.ram.model.Employee;
import com.ram.model.Person;
import com.ram.model.Student;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Person person=new Person();
		person.setName("Ram");
		
		Student student=new Student();
		student.setName("Omkar");
		student.setRollNo(101);
		student.setMarks(85);
		
		Employee employee=new Employee();
		employee.setName("Amol");
		employee.setProfile("Developer");
		employee.setSalary(50000);
		
		session.save(person);
		session.save(student);
		session.save(employee);
		transaction.commit();
		
		System.out.println("Saved");
		
	}

}
