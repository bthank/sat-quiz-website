package com.sat.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sat_words")
public class SATWord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="sat_word")
	private String satWord;
	
	@Column(name="sat_word_definition")
	private String satWordDefinition;
	
	@Column(name="sentence_containing_sat_word")
	private String sentenceWithSATWord;

	public SATWord() {
		 
	}

	public SATWord(String satWord, String satWordDefinition, String sentenceWithSATWord) {
		this.satWord = satWord;
		this.satWordDefinition = satWordDefinition;
		this.sentenceWithSATWord = sentenceWithSATWord;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSatWord() {
		return satWord;
	}

	public void setSatWord(String satWord) {
		this.satWord = satWord;
	}

	public String getSatWordDefinition() {
		return satWordDefinition;
	}

	public void setSatWordDefinition(String satWordDefinition) {
		this.satWordDefinition = satWordDefinition;
	}

	public String getSentenceWithSATWord() {
		return sentenceWithSATWord;
	}

	public void setSentenceWithSATWord(String sentenceWithSATWord) {
		this.sentenceWithSATWord = sentenceWithSATWord;
	}

	@Override
	public String toString() {
		return "SATWord [id=" + id + ", satWord=" + satWord + ", satWordDefinition=" + satWordDefinition
				+ ", sentenceWithSATWord=" + sentenceWithSATWord + "]";
	}
	
	
}
