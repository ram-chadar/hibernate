package com.ram.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ram.model.ChequePayment;
import com.ram.model.CreditCardPayment;
import com.ram.model.Payment;

public class Save {

	public static void main(String[] args) {

		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		/*Payment payment=new Payment();
		payment.setAccHolder("Ram Chadar");*/
		
		
		CreditCardPayment creditCardPayment=new  CreditCardPayment();
		creditCardPayment.setAmount(45879);
		creditCardPayment.setAccHolder("Amol Bansode");
		creditCardPayment.setC_c_Number(5546879);
		creditCardPayment.setCreditCardType("SubPrime");
		
		ChequePayment chequePayment=new ChequePayment();
		chequePayment.setAmount(150000);
		chequePayment.setAccHolder("Amar Wagh");
		chequePayment.setCheckNumber(874569);
		chequePayment.setBankName("BOI");
		
	//	session.save(payment);
		session.save(chequePayment);
		session.save(creditCardPayment);
		
		transaction.commit();
		System.out.println("saved");
	}

}
