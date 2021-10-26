package com.xworkz.core.wrapperclasses;

public class WrapperShortStarter {

	public static void main(String[] args) {
		short s=20;
		Short obj=new Short(s);
		System.out.println();
		System.out.println("ToString:"+obj.toString());
		System.out.println("static ToString:"+Short.toString(s));
		System.out.println("Value Of:"+Short.valueOf(s));
		System.out.println("Hash Code:"+obj.hashCode());
		System.out.println("static Hash Code"+Short.hashCode(s));
	}

}
