package com.hibernate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question {
  @Id
  private  int q_id;

  private String question;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "answer_id")
  private Answer answer;

  public int getQ_id() {
    return q_id;
  }

  public void setQ_id(int q_id) {
    this.q_id = q_id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public Question() {
    System.out.println("Question Constructor");
  }

  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }
}