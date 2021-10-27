package com.xworkz.inheritance.shop;

public class GoldFish extends Fish {
	public String color="Gold";
	public int size=5;
	
public GoldFish() {
	this("Chinnu");
	System.out.println("Invoke GoldFish Constructor");
}	

public GoldFish(String name) {
	System.out.println("The name is"+name);
}
}
