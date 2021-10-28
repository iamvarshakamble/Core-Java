package com.xworkz.inheritance.shop;

public class Factory {
	private String name;
    public String product="table";
	private int since;
	private float revenue;
	
	public Factory() {
		System.out.println("Invoke no-arg constructor from factory");
	}
}
