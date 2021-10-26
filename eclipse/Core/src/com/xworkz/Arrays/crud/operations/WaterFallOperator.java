package com.xworkz.core.Arrays.crud.operations;

public class WaterFallOperator {
	private String waterfallCountry;
	private String waterfallNames[]=new String[5];
	int count=0;
	
	public WaterFallOperator() {
		this("India");
		System.out.println("Invoke WaterFall Operator");
	}
	
	public WaterFallOperator(String name) {
		this.waterfallCountry=name;
	}
	
	public String getWaterfallCountry() {
		return waterfallCountry;
	}
	
    public void addWaterfallName(String name)
    {
    	if(count<5) {		
    		this.waterfallNames[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayWaterfallName() {
    	System.out.println("Resort Locations");
		for(int i=0;i<this.waterfallNames.length;i++) {
		String name=this.waterfallNames[i];
		System.out.println(name);
		}

	}
}
