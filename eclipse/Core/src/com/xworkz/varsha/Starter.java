package com.xworkz.varsha;

import com.xworkz.varsha.school.*;

public class Starter {

	public static void main(String[] args) {
		Intro intro=new Intro();
		intro.setName("Varsha");
		intro.setAge(21);
		System.out.println(intro.getName());
		System.out.println(intro.getAge());
		
		Home home=new Home();
		home.setArea("Sahadev Nagar");
		home.setHouse_No(239);
		
		School_Intro schoolIntro=new School_Intro();
		schoolIntro.setSchool_Name("Oriental Public School");
		System.out.println(schoolIntro.getSchool_Name());
		
		School_Area schoolArea=new School_Area();
		schoolArea.setArea("Gokul road");
		System.out.println(schoolArea.getArea());
		
		Education education=new Education();
		education.setBoard("ICSE");
		System.out.println(education.getBoard());
		
		com.xworkz.varsha.school.Education education1=new Education();
		education1.setBoard("Changed to State");
		System.out.println(education1.getBoard());
		
		

	}

}
