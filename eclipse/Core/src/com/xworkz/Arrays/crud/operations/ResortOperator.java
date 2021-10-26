package com.xworkz.core.Arrays.crud.operations;

public class ResortOperator {
	private String resortName;
	private String resortLocation[]=new String[5];
	int count=0;
	
	public ResortOperator() {
		this("Royal Galaxy");
		System.out.println("Invoke Resort Operator");
	}
	
	public ResortOperator(String name) {
		this.resortName=name;
	}
    
	public String getResortName() {
		return resortName;
	}
    
    public void addResortLocation(String name)
    {
    	if(count<5) {		
    		this.resortLocation[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayResortLocation() {
    	System.out.println("Resort Locations");
		for(int i=0;i<this.resortLocation.length;i++) {
		String name=this.resortLocation[i];
		System.out.println(name);
		}

	}
}
