package com.xworkz.core.wrapperclasses;

public class WrapperBooleanStarter {

	public static void main(String[] args) {
		boolean b=true;
		boolean b1=false;
		String name="varsha";
		Boolean obj=new Boolean(b);
		System.out.println("Boolean Value:"+obj.booleanValue());
		System.out.println("Compare:"+Boolean.compare(b, b1));
		System.out.println("Compare To:"+obj.compareTo(obj));
		System.out.println("Hash Code:"+obj.hashCode());
		System.out.println("Get Boolean:"+Boolean.getBoolean(name));
	}

}
