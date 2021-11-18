package com.xworkz.interfaces.hostel;

import com.xworkz.interfaces.constants.Address;

public class IndianCitizen implements VotingRule, TrafficRule, MarriageRule{

	private String name;
	private Address address;
	
	public IndianCitizen(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void displayDetails() {
		System.out.println(this.name+" "+this.address);
	}
	
	@Override
	public int validAge() {
		System.out.println("invoke validAge");
		// TODO Auto-generated method stub
		return 21;
	}

	@Override
	public String validId() {
		System.out.println("invoke validId");
		// TODO Auto-generated method stub
		return "VoterID";
	}

	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("invoke validAge");
		System.out.println(gender+" "+age);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoke validLicence");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String LicenseNo() {
		System.out.println("invoke LicenseNo");
		// TODO Auto-generated method stub
		return "drtdi67eku";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoke validInsurance");
		// TODO Auto-generated method stub
		return true;
	}

}
