package com.xworkz.core.Arrays.crud.operations;

public class GinOperator {
	private String ginDrink;
	private String ginBrand[]=new String[5];
	int count=0;
		
	public GinOperator() {
		this("Alcholic Drink");
		System.out.println("Invoke Gin Operator");
	}

	public GinOperator(String name) {
		this.ginDrink=name;
	}
	
	public String getGinDrink() {
		return ginDrink;
	}
    
    public void addGinBrandName(String name)
    {
    	if(count<5) {		
    		this.ginBrand[this.count]=name;
    		count++;
    	}else {
    		System.out.println("Array is full");
    	}
    }
    public void displayGinBrandName() {
    	System.out.println("Gin Brands");
		for(int i=0;i<this.ginBrand.length;i++) {
		String name=this.ginBrand[i];
		System.out.println(name);
		}

	}
}
