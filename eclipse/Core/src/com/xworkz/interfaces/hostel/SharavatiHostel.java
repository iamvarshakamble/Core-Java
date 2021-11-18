package com.xworkz.interfaces.hostel;

public class SharavatiHostel implements HostelRules, VisitorRules {

	@Override
	public int inTime() {
		System.out.println("invoked inTime");
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String visitDay() {
		System.out.println("invoked visitDay");
		// TODO Auto-generated method stub
		return "Sunday";
	}
	
}
