package com.xworkz.core.wrapperclasses;

public class WrapperFloatStarter {

	public static void main(String[] args) {
		float f=15.5f;
		Float obj=new Float(f);
		System.out.println("FloatToIntBits:"+Float.floatToIntBits(f));
		System.out.println("FloatToRawBits:"+Float.floatToRawIntBits(f));
		System.out.println("isNaN:"+obj.isNaN());
		System.out.println("isInfinite:"+Float.isFinite(f));
		System.out.println("intValue:"+obj.intValue());
	}

}
