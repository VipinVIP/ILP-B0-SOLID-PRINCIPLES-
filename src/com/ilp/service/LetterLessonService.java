package com.ilp.service;

import com.ilp.interfaces.LetterSound;

public class LetterLessonService implements LetterSound{

	@Override
	public String getSound(char letter) {
		
		return "Called getSound on "+letter;
	}

	@Override
	public void setSound(String sound) {
		System.out.print("\n Called setSound");
		
	}

}
