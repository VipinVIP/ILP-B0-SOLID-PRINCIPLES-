package com.ilp.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ilp.entity.Chapter;
import com.ilp.entity.Language;
import com.ilp.entity.Lesson;
import com.ilp.entity.LetterLesson;
import com.ilp.entity.Section;
import com.ilp.entity.Unit;
import com.ilp.entity.WordLesson;
import com.ilp.interfaces.LetterSound;
import com.ilp.interfaces.WordDefinition;
import com.ilp.service.LetterLessonService;
import com.ilp.service.WordLessonService;

public class LanguageUtility {

	public static void main(String[] args) {
		
//	Started Initialization
		Lesson lessonOne=new WordLesson("lesson-one", true, "comment ca va");
		Lesson lessonTwo=new LetterLesson("lesson-two",false,'e');
		ArrayList<Lesson> lessonList=new ArrayList<Lesson>(List.of(lessonOne,lessonTwo));
		
		Chapter chapterOne=new Chapter("Chapter 1","talk about people",lessonList);
		ArrayList <Chapter> chapterList=new ArrayList<Chapter>(List.of(chapterOne));
		
		Unit unitOne=new Unit("Unit 1","First Rookie Unit",chapterList);
		ArrayList<Unit>unitList=new ArrayList<Unit>(List.of(unitOne));
		
		Section sectionOne = new Section("Rookie",unitList);
		ArrayList<Section> sectionList= new ArrayList<Section>(List.of(sectionOne));
		
		Language languageOne= new Language("French","fr",sectionList);
		
		Scanner scanner = new Scanner(System.in);
//  Initialization complete.
		
		ArrayList <Lesson> tempLessonList = languageOne.getSectionList().get(0).getUnitList().get(0).getChapterList().get(0).getLessonList();	
		System.out.println("1.Letter Lesson or 2.Word Lesson\n Enter your number : ");
		
		int choice=scanner.nextInt();
		
		Lesson currentLesson=null;
		
		if(choice==1) {
			currentLesson=tempLessonList.get(0);
			WordDefinition wordDefinitionService = new WordLessonService();
			System.out.println(wordDefinitionService.getDefinition(((WordLesson)currentLesson).getWord()));
		}else {
			currentLesson=tempLessonList.get(1);
			LetterSound letterSoundService = new LetterLessonService();
			System.out.println( letterSoundService.getSound(((LetterLesson)currentLesson).getLetter()));
		}
	}

}
