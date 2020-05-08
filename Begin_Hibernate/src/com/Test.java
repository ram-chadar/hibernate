package com;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class Test {

	public static void main(String[] args) {
Configuration cfg=new Configuration();
cfg.configure();
SessionFactory ss=cfg.buildSessionFactory();
Session sesn=ss.openSession();
Transaction tx=sesn.beginTransaction();
Emp e=new Emp();
//e.setId(1);
e.setEmpname("pavan");
sesn.save(e);
System.out.println("Inserted..."+e.getEmpname());

// to delete
Object o=sesn.load(Emp.class, new Integer(4));
Emp ee=(Emp)o;
sesn.delete(ee);
System.out.println("record deleted where id="+ee.getId());
//SaveorUpdate
Emp eee=new Emp(3,"replaced");
sesn.saveOrUpdate(eee);
System.out.println("update record where id="+eee.getId());

//to fetch
Query q=sesn.createQuery("from emp");
java.util.List list=q.list();
System.out.println(list);

Emp e1=new Emp(); // but first override toString() method in Emp.java (pojo class)
//and there get id and empname
e1=(Emp)sesn.get(Emp.class,1);

System.out.println(e1);

tx.commit();

	}

}