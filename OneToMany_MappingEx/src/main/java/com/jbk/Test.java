package com.jbk;

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
		
		/*Question q=new Question();
		
		q.setQuestion("What is java ?");
		
		Answer answer=new Answer();
		
		answer.setAnswer("java is programming language");
		answer.setPostedBy("jbk");
		
		Answer answer2=new Answer();
	
		answer2.setAnswer("java is platform independant");
		answer2.setPostedBy("ram");
		
		List<Answer> answerList=new ArrayList<Answer>();
		answerList.add(answer);
		answerList.add(answer2);
		
		q.setAnswer(answerList);
		
		session.save(q);*/
		
		
		Question q=session.load(Question.class,4);
		session.delete(q);
		
		
		tx.commit();
		
		
		
		
		
	}

}
