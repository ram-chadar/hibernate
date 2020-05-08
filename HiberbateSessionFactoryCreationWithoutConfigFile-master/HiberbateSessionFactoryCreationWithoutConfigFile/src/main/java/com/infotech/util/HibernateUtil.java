package com.infotech.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.infotech.client.Employee;

/**
 * @author kishan Kumar
 */

public class HibernateUtil {
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;

	static {
		
		// Hibernate settings which is equivalent to hibernate.cfg.xml's properties

		Configuration cfg=new Configuration();
		Properties prop=new Properties();
		prop.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
		prop.put(Environment.USER, "root");
		prop.put(Environment.PASS, "admin");
		prop.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		prop.put(Environment.SHOW_SQL, "true");
		prop.put(Environment.HBM2DDL_AUTO, "update");
		cfg.setProperties(prop);
		cfg.addAnnotatedClass(Employee.class);
		ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory=cfg.buildSessionFactory(sr);
	}
		
		

	// Utility method to return SessionFactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}