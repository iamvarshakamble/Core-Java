package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.NaturalSaloon;
import com.xworkz.inheritance.shop.Saloon;

public class SaloonStarter {

	public static void main(String[] args) {
		NaturalSaloon naturalSaloon=new NaturalSaloon();
		System.out.println(naturalSaloon.name);
		System.out.println(naturalSaloon.noOfHajamas);
		
		Saloon saloon=new Saloon();
	    System.out.println(saloon.name);
	    System.out.println(saloon.noOfHajamas);
	}

}
