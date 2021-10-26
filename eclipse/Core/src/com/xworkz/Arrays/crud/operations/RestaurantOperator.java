package com.xworkz.core.Arrays.crud.operations;

public class RestaurantOperator {
	private String restaurantName;
	private String restaurantBranch[]=new String[5];
	int count=0;
	
	public RestaurantOperator() {
		this("Udupi Restaurant");
		System.out.println("Invoke Restaurant Operator");
	}

	public RestaurantOperator(String name) {
		this.restaurantName=name;
	}
    
	public String getRestaurantName() {
		return restaurantName;
	}
    
    public void addRestaurantBranch(String name)
    {
    	if(count<5) {		
    		this.restaurantBranch[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayRestaurantBranch() {
    	System.out.println("Restaurant Branches");
		for(int i=0;i<this.restaurantBranch.length;i++) {
		String name=this.restaurantBranch[i];
		System.out.println(name);
		}

	}
}
