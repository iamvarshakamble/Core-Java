package com.xworkz.core.wrapperclasses;

public class WrapperLongStarter {

	public static void main(String[] args) {
		long l=199999;
		Long obj=new Long(l);
		String name="varsha";
		System.out.println("Bit Count:"+Long.bitCount(l));
		System.out.println("Get Long:"+Long.getLong(name));
		System.out.println("Reverse:"+Long.lowestOneBit(l));
		System.out.println("LongValue:"+obj.longValue());
		System.out.println("Reverse:"+Long.reverse(l));
	}

}
