package com.xworkz.core.wrapperclasses;

public class WrapperIntegerStarter {

	public static void main(String[] args) {
		int a=1005;
		Integer obj=a;
		int value=45;
		System.out.println("Byte Value:"+obj.byteValue());
		System.out.println("Short Value:"+obj.shortValue());
		System.out.println("Double Value:"+obj.doubleValue());
		System.out.println(Integer.bitCount(value));
		System.out.println(Integer.highestOneBit(value));
	}

}
