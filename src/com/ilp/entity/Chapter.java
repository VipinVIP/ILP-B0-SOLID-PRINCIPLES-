package com.ilp.entity;

import java.util.ArrayList;

public class Chapter {
	private String chapterName;
	private String chapterDescription;
	private ArrayList<Lesson> lessonList = new ArrayList<Lesson>();
	
	public Chapter(String chapterName, String chapterDescription, ArrayList<Lesson> lessonList) {
		this.chapterName = chapterName;
		this.chapterDescription = chapterDescription;
		this.lessonList = lessonList;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getChapterDescription() {
		return chapterDescription;
	}

	public void setChapterDescription(String chapterDescription) {
		this.chapterDescription = chapterDescription;
	}

	public ArrayList<Lesson> getLessonList() {
		return lessonList;
	}

	public void setLessonList(ArrayList<Lesson> lessonList) {
		this.lessonList = lessonList;
	}

}
