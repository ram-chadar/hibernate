package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class QryTest {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session sesn=sf.openSession();
	
	/*Query q=sesn.createQuery("select id,name from Employee order by name desc");
	List <Employee>l=q.list();*/
	Criteria crt=sesn.createCriteria(Employee.class);
crt.setProjection(Projections.max("id"));
List l2=crt.list();

	
	for(Object emp:l2)
	{
		/*System.out.print(emp.getId()+"\t");
		System.out.print(emp.getName()+"\t");
		System.out.print(emp.getSalary()+"\t");*/
		System.out.println(emp);
	}
		
	}

}
