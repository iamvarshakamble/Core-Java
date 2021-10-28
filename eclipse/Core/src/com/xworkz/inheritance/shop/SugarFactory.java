package com.xworkz.inheritance.shop;

public class SugarFactory extends Factory {
	String name="factory";
	
	public SugarFactory() {
		System.out.println("invoke constructor from sugarfactory");
	}
	
	public SugarFactory(String name) {
		this.name=name;
		System.out.println(name);
	}
}
