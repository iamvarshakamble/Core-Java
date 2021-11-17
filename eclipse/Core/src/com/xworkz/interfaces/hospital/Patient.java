package com.xworkz.interfaces.hospital;

public class Patient implements HospitalAdmitRule, HospitalDischargeRule{

	@Override
	public boolean payBill() {
		System.out.println("invoked payBill");
		return true;
	}

	@Override
	public double discount() {
		System.out.println("invoked discount");
		return 50;
	}

	@Override
	public String register() {
		System.out.println("invoked register");
		return "Varsha";
	}

	@Override
	public double payAdvance() {
		System.out.println("invoked payAdvance");
		return 1000;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("invoked validInsurance");
		return true;
	}

}
