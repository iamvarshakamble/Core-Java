package com.xworkz.core.wrapperclasses;

public class WrapperDoubleStarter {

	public static void main(String[] args) {
		double d=1500.0d;
		double d1=1550.0d;
		Double obj=new Double(d);
		System.out.println("Byte Value:"+obj.byteValue());
		System.out.println("Compare:"+Double.compare(d1, d));
        System.out.println("Hash Code:"+obj.hashCode());
        System.out.println("Double Value:"+obj.doubleValue());
        System.out.println("Value Of:"+Double.valueOf(d1));
        
	}

}
