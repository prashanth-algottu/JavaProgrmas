package com.tectoro.HibernateFourthOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer 
{
	@Id
	private int ans_id;
	private String answer;
	@OneToOne(mappedBy = "ans")
	private Question question;
	public Answer(int ans_id, String answer, Question question) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	

}
