package com.ram;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Question {
	
	@Id
	@Column
	
	private int qid;
	
	@Column
	private String question;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="qid")
	private List<Answer> Answer;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(int qid, String question, List<com.ram.Answer> answer) {
		super();
		this.qid = qid;
		this.question = question;
		Answer = answer;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return Answer;
	}

	public void setAnswer(List<Answer> answer) {
		Answer = answer;
	}
	
	

}
