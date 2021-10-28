package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.Factory;
import com.xworkz.inheritance.shop.SugarFactory;

public class FactoryStarter {
	public static void main(String[] args) {
		Factory factory=new Factory();
		System.out.println(factory.product);
		Factory factory1=new SugarFactory();
		factory1=new SugarFactory("fan");
		Object obj=new Factory();
		Object obj1=new SugarFactory();
		obj=new SugarFactory();
		
	}
}
