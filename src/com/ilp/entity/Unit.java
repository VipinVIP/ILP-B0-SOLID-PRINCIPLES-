package com.ilp.entity;

import java.util.ArrayList;

public class Unit {
	private String unitName;
	private String unitDescription;
	private ArrayList<Chapter> chapterList = new ArrayList<Chapter>();
	
	public Unit(String unitName, String unitDescription, ArrayList<Chapter> chapterList) {
		this.unitName = unitName;
		this.unitDescription = unitDescription;
		this.chapterList = chapterList;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitDescription() {
		return unitDescription;
	}

	public void setUnitDescription(String unitDescription) {
		this.unitDescription = unitDescription;
	}

	public ArrayList<Chapter> getChapterList() {
		return chapterList;
	}

	public void setChapterList(ArrayList<Chapter> chapterList) {
		this.chapterList = chapterList;
	}
}
