package com.ilp.entity;

public abstract class Lesson {
	private String lessonTitle;
	private Boolean islessonCompleted;

	public String getLessonTitle() {
		return lessonTitle;
	}

	public Lesson(String lessonTitle, Boolean islessonCompleted) {
		this.lessonTitle = lessonTitle;
		this.islessonCompleted = islessonCompleted;
	}

	public void setLessonTitle(String lessonTitle) {
		this.lessonTitle = lessonTitle;
	}

	public Boolean getIslessonCompleted() {
		return islessonCompleted;
	}

	public void setIslessonCompleted(Boolean islessonCompleted) {
		this.islessonCompleted = islessonCompleted;
	}
}
