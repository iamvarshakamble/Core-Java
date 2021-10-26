package com.xworkz.core.Arrays.crud.operations;

public class BeachOpeartor {
	private String country;
	private String beachName[]=new String[5];
	int count=0;
	
    public BeachOpeartor() {
    	this("INDIA");
		System.out.println("Invoke Beach Operator");
	}
    
    public BeachOpeartor(String name) {
    	this.country=name;
	}
    
    public String getCountry() {
		return country;
	}
    
    public void addBeachName(String name)
    {
    	if(count<5) {		
    		this.beachName[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayBeachName() {
    	System.out.println("Beach Names");
		for(int i=0;i<this.beachName.length;i++) {
		String name=this.beachName[i];
		System.out.println(name);
		}

	}
    	
    }
