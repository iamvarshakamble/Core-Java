package com.xworkz.inheritance.shop;

public class SharkFish extends Fish {
	public String height="50cm";
	public String weight="200kg";
	
	public SharkFish() {
		this("Chintu");
		System.out.println("Invoke SharkFish no-arg constructor");
	}
	
	public SharkFish(String name) {
		System.out.println("The fish name is "+name);
	}
}
