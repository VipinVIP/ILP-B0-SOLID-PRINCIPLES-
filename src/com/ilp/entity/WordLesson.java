package com.ilp.entity;

public class WordLesson extends Lesson {
	
	private String word;
	
	public WordLesson(String lessonTitle, Boolean islessonCompleted, String word) {
		super(lessonTitle, islessonCompleted);
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
}
