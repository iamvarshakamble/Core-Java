package com.xworkz.core.stringclasses;

public class CoffeeStarter {

	public static void main(String[] args) {
		
		String institute="Xworkz";
		char[] array=institute.toCharArray();
		System.out.println(array.length);
		int len=institute.length();
		System.out.println(len);
		System.out.println(array[2]);
		
		char c=institute.charAt(5);
		System.out.println(c);
		
		String partOfInstitute=institute.substring(4);
		System.out.println(partOfInstitute);
		partOfInstitute=partOfInstitute.replace("k", "T");
		System.out.println(partOfInstitute);
	}

}
