package com.xworkz.core.wrapperclasses;

public class WrapperByteStarter {

	public static void main(String[] args) {
		byte b=50;
		byte b1=60;
		Byte obj=new Byte(b);
		System.out.println("Byte Value:"+obj.byteValue());
		System.out.println("Compare:"+Byte.compare(b, b1));
		System.out.println("CompareTo:"+obj.compareTo(obj));
		System.out.println("Double:"+obj.doubleValue());
		System.out.println("Float:"+obj.equals(obj));

	}

}
