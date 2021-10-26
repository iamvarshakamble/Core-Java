package com.xworkz.core.Arrays.crud.operations;

public class Chocolate {
	private String chocolateCompany;
	private String chocolateName[]=new String[5];
	int count=0;
	
	public Chocolate() {
		this("Cadbury");
		System.out.println("Invoke Chocolate Operator");
	}
	
	public Chocolate(String name) {
		this.chocolateCompany=name;
	}
    
    public String getChocolateCompany() {
		return chocolateCompany;
	}
    
    public void addChocolateName(String name)
    {
    	if(count<5) {		
    		this.chocolateName[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayChocolateName() {
    	System.out.println("Chocolate names");
		for(int i=0;i<this.chocolateName.length;i++) {
		String name=this.chocolateName[i];
		System.out.println(name);
		}

	}
}
