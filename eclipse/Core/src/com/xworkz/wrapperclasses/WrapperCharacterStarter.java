package com.xworkz.core.wrapperclasses;

public class WrapperCharacterStarter {

	public static void main(String[] args) {
		char a='v';
		Character obj=new Character(a);
		System.out.println("Char Count:"+Character.charCount(a));
		System.out.println("Char Value:"+obj.charValue());
		System.out.println("Hash Code:"+obj.hashCode());
		System.out.println("Get Type:"+Character.getType(a));
		System.out.println("Get Name:"+Character.getName(a));

	}

}
