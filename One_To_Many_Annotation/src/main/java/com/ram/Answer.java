package com.ram;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Answer {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int aid;
	
	@Column
	private String answer;
	
	@Column
	private String PostedBy;
	
	
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(int aid, String answer, String postedBy) {
		super();
		this.aid = aid;
		this.answer = answer;
		PostedBy = postedBy;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPostedBy() {
		return PostedBy;
	}

	public void setPostedBy(String postedBy) {
		PostedBy = postedBy;
	}
	
	

}
