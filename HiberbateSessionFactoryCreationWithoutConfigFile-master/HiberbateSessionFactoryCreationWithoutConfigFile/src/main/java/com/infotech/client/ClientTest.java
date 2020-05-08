package com.infotech.client;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.infotech.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Check MySQL database version
			String sql = "select version()";
			String sql2="select * from employee";

		//	String result = (String) session.createNativeQuery(sql2).getSingleResult();
		Query q=session.createQuery("from Employee");
		List<Employee> l=q.list();
		
		for(Employee e:l)
		{
			System.out.println(e.getName());
		}
		
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  }
}
