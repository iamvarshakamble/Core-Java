package com.xworkz.diamond;

import com.xworkz.diamond.shop.*;

public class DiamondStarter {

	public static void main(String[] args) {
		Mine mine=new Mine();
		mine.setName("Diamond");
		mine.setWork("Mining");
		System.out.println(mine);
		System.out.println(mine.getName());
		System.out.println(mine.getWork());

		Joyallukas joyallukas=new Joyallukas();
		joyallukas.setName("Diamond");
		System.out.println(joyallukas.getName());
		
		Branch branch=new Branch();
		System.out.println(branch);
		
		com.xworkz.diamond.shop.Branch branch1=new Branch();
		System.out.println(branch1);
	}

}
