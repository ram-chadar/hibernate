package com.ram;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static  SessionFactory sf=null;
	public static SessionFactory getSessionFactory()
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		sf=configuration.buildSessionFactory();
		return sf;
	}

}
