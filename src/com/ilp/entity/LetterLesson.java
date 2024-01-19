package com.ilp.entity;

public class LetterLesson extends Lesson {
	
private char letter;

public LetterLesson(String lessonTitle, Boolean islessonCompleted, char letter) {
	super(lessonTitle, islessonCompleted);
	this.letter = letter;
}

public char getLetter() {
	return letter;
}

public void setLetter(char letter) {
	this.letter = letter;
}


}
