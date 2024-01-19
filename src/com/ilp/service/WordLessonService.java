package com.ilp.service;

import com.ilp.interfaces.WordDefinition;

public class WordLessonService implements WordDefinition{

	@Override
	public String getDefinition(String word) {
		return "Called getDefinitions on "+word;
	}

	@Override
	public void setDefinition(String definition) {
		System.out.print("\n Called setDefenition");
		
	}

}
