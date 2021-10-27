package com.xworkz.inheritance.shop;

public class NaturalSaloon extends Saloon{
	public String name="Vaishnvai";
	public int noOfHajamas=3;
	
	public NaturalSaloon() {
		this("Varsha");
		System.out.println("Invoke no-arg constructor");
	}
	
	public NaturalSaloon(String name) {
		super();
		System.out.println("The string name is"+name);
	}
}
