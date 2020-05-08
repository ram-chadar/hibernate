package com.jbk.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import java.util.List;
public class FetchData_Test 
{
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory ss=cfg.buildSessionFactory();
	Session sesn=ss.openSession();
	Transaction tx=sesn.beginTransaction();
	

	Query query = sesn.createQuery("select sid,sname from Student");
	
		List<Object[]> lst = query.list();
		for (Object[] objArray : lst) {
			for (Object obj : objArray) {
				if(obj instanceof String){
					String str = (String) obj;
					System.out.println(str);
				}
				if(obj instanceof Integer){
					Integer str = (Integer) obj;
					System.out.println(str);

				}

				
			}

		}
 }
}
