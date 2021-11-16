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
	public boolean validAge(char gender, int age) {
		System.out.println("invoked validAge");
		System.out.println(gender+" "+age);
		return true;
	}

	@Override
	public boolean validLicence() {
		System.out.println("invoked validLicence");
		return true;
	}

	@Override
	public String LicenseNo() {
		System.out.println("invoked LicenseNo");
		return "v6bt67ib";
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked validInsurance");
		return true;
	}

	@Override
	public int validAge() {
		System.out.println("invoked validAge");
		return 21;
	}

	@Override
	public String validId() {
		System.out.println("invoked validId");
		return "VoterID";
	}

}
