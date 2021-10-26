package com.xworkz.core.stringclasses;

public class StringClasses {

	public static void main(String[] args) {
		String name=new String("Varsha");
		char ch=name.charAt(4);
		System.out.println("chartAt: "+ch);
		
		String name1=new String("Kamble");
		System.out.println("compareTo:"+name1.compareTo("Karsha"));
		
		String name2=new String("hello world");
		boolean endsWith=name2.endsWith("d");
		System.out.println("endsWith:"+endsWith);
		
		boolean startsWih=name2.startsWith("h");
		System.out.println("startsWith:"+startsWih);
		
		int length=name.length();
		System.out.println("length:"+length);
		
		int indexof=name2.indexOf("world");
		System.out.println("indexOf:"+indexof);
		
		String name3=new String("my name is varsha");
		int lastIndexOf=name3.lastIndexOf("varsha");
		System.out.println("lastIndexOf:"+lastIndexOf);
		
		String substring=name.substring(3);
		System.out.println("Substring: "+substring);
		
		
		char[] chars=name.toCharArray();
		System.out.println(chars);
		
		String name4=new String("XWORKZ");
		String toLowerCase=name4.toLowerCase();
		System.out.println("toLowerCase: "+toLowerCase);
		
	}

}
