package com.xworkz.core.Arrays.crud.operations;

public class Cooldrink {

	private String[] brandName=new String[7];
	private int godzilla=0;
	public void addBrand(String name) {
		System.out.println("Brand Name:".concat(name));
		if(godzilla<brandName.length) {
		this.brandName[this.godzilla]=name;
		this.godzilla++;
		System.out.println("Godzilla:".concat(String.valueOf(this.godzilla)));
		}
		else {
			System.err.println("Array is full".concat(String.valueOf(this.brandName.length)));
		}
	}
		public void displayBrand() {
			for(int i=0;i<brandName.length;i++) {
				String name=this.brandName[i];
				System.out.println(name);
			}
			
		}
		public void deleteReference(int index) {

		if(index>=0 && index<=this.brandName.length ) {
			this.brandName[index]=null;
			System.out.println("delete index:".concat(String.valueOf(index)));
			
		}
		else {
			System.err.println("cannot find the index");
		}
		
		}
		public void updateBrand(int index,String bname) {
			if(index>=0 && index<brandName.length && bname!=null) {
				this.brandName[index]=bname;
				System.out.println("Updated:".concat(String.valueOf(index)));
			
		}		
			else {
				System.err.println("cannot be equal null");
			}
		}
}
