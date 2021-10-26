package com.xworkz.core.Arrays.crud.operations;

public class RocketOperator {
	private String rocketLocation;
	private String rocketName[]=new String[5];
	int count=0;
	
	public RocketOperator() {
		this("India");
		System.out.println("Invoke Rocket Operator");
	}
    
	public RocketOperator(String name) {
		this.rocketLocation=name;
	}
    
	public String getRocketLocation() {
		return rocketLocation;
	}
    
    public void addRocketName(String name)
    {
    	if(count<5) {		
    		this.rocketName[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayRocketName() {
    	System.out.println("Rocket Branches");
		for(int i=0;i<this.rocketName.length;i++) {
		String name=this.rocketName[i];
		System.out.println(name);
		}

	}
}
