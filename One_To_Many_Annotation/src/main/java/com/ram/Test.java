package com.ram;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q=new Question();
		q.setQid(2);
		q.setQuestion("xyz");
		
		Answer answer=new Answer();
		answer.setAnswer("xyz1");
		answer.setPostedBy("ram");
		
		Answer answer2=new Answer();
		answer2.setAnswer("xyz2");
		answer2.setPostedBy("harsh");
		
		List<Answer> answerList=new ArrayList<Answer>();
		answerList.add(answer);
		answerList.add(answer2);
		
		q.setAnswer(answerList);
		
		session.save(q);
		
		
		
		tx.commit();
		
		
		
		
		
	}

}
