package com.xworkz.interfaces.hostel;

public class AfricanCitizen implements VotingRule,TrafficRule,MarriageRule {

	private String name;
	private String stateName;
	
	public AfricanCitizen(String name, String stateName) {
		super();
		this.name = name;
		this.stateName = stateName;
	}
	
	public void displayDetails() {
		System.out.println(this.name+" "+this.stateName);
	}

	@Override
	public boolean validAge(char gender, int age) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validLicence() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String LicenseNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validInsurance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int validAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String validId() {
		// TODO Auto-generated method stub
		return null;
	}

}
