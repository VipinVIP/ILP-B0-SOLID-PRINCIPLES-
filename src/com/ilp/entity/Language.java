package com.ilp.entity;

import java.util.ArrayList;

public class Language {
	private String languageName;
	private String languageCode;

	private ArrayList<Section> sectionList = new ArrayList<Section>();

	public Language(String languageName, String languageCode, ArrayList<Section> sectionList) {
		this.languageName = languageName;
		this.languageCode = languageCode;
		this.sectionList = sectionList;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public ArrayList<Section> getSectionList() {
		return sectionList;
	}

	public void setSectionList(ArrayList<Section> sectionList) {
		this.sectionList = sectionList;
	}
}
