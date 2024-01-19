package com.ilp.entity;

import java.util.ArrayList;

public class Section {
 private String sectionName;
	private ArrayList<Unit> unitList = new ArrayList<Unit>();
	
	public Section(String sectionName, ArrayList<Unit> unitList) {
		this.sectionName = sectionName;
		this.unitList = unitList;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public ArrayList<Unit> getUnitList() {
		return unitList;
	}

	public void setUnitList(ArrayList<Unit> unitList) {
		this.unitList = unitList;
	}
}
