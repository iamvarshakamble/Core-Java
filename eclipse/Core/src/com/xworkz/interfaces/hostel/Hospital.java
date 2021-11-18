package com.xworkz.interfaces.hostel;

public class Hospital {
	private String name;
	private String location;
	private boolean govt;
	private HospitalAdmitRule hospitalAdmitRule;
	private HospitalDischargeRule hospitalDischargeRule;
	
	public Hospital(String name, String location, boolean govt, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRule hospitalDischargeRule) {
		super();
		this.name = name;
		this.location = location;
		this.govt = govt;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule = hospitalDischargeRule;
	}
	
	public void admitPatient() {
		System.out.println("invoked admitPatient");
		if(this.hospitalAdmitRule!=null) {
			System.out.println("Patient invoked");
			String register=this.hospitalAdmitRule.register();
			System.out.println("Patient name: "+register);
			double payAdvance=this.hospitalAdmitRule.payAdvance();
			System.out.println("Advance paid is: "+payAdvance);
			boolean insurance=this.hospitalAdmitRule.validInsurance();
			if(payAdvance >=1000 || insurance==false) {
				System.out.println("Pay Advance");
				if(insurance) {
					System.out.println("No need to pay advance");
				}else {
					System.err.println("Pay Advance");
				}
			}
			
		}else {
			System.err.println("No patient");
		}
	}
	
	public void dischargePatient() {
//		System.out.println("invoked dischargePatient");
		if(this.hospitalDischargeRule!=null) {
			System.out.println("invoked patient");
			boolean bill=this.hospitalDischargeRule.payBill();
			if(bill) {
				System.out.println("Bill paid");
				double discount=this.hospitalDischargeRule.discount();
				System.out.println("Discount is"+discount);
			}else {
				System.err.println("Bill not paid");
			}
		}else {
			System.out.println("No patient");
		}
	}
}
