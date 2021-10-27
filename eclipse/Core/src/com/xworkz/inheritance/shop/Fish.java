package com.xworkz.inheritance.shop;

public class Fish {
	public String region="Mangaluru";
	public boolean alive=true;
	
	public Fish() {
		this("Chikki");
		System.out.println("Invoke Fish no-arg construtor");
	}
	
	public Fish(String name) {
		System.out.println("The Fish name is"+name);
	}
}
