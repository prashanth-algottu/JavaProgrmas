package com.tectoro.HibernateFourthOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	private int question_id;
	private String question;
	
	@OneToOne
	private Answer ans;

	public Question(int question_id, String question, Answer ans) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.ans = ans;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	
	
}
