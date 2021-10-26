package com.xworkz.core.Arrays.crud.operations;

public class IslandOperator {
	private String islandCountry;
	private String islandNames[]=new String[5];
	int count=0;
	
	public IslandOperator() {
		this("Sweden");
		System.out.println("Invoke Island Operator");
	}
	
	public IslandOperator(String name) {
		this.islandCountry=name;
	}
	
	public String getIslandCountry() {
		return islandCountry;
	}
    
    public void addIslandName(String name)
    {
    	if(count<5) {		
    		this.islandNames[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayIslandName() {
    	System.out.println("Resort Locations");
		for(int i=0;i<this.islandNames.length;i++) {
		String name=this.islandNames[i];
		System.out.println(name);
		}

	}
}
