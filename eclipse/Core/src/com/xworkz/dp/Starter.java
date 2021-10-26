package com.xworkz.dp;

import com.xworkz.dp.dto.Bracelet;

public class Starter {

	public static void main(String[] args) {
		Bracelet bracelet=new Bracelet();
		bracelet.setColor("Black");
		bracelet.setGemUsed(true);
		bracelet.setGifted(true);
		bracelet.setMaterial("Platinum");
		bracelet.setPrice(50.0f);
		
		Bracelet bracelet1=new Bracelet("White", 20.0f, "gold", true, false);
		Bracelet bracelet2=new Bracelet("Silver", 10.0f, "gold", false, false);
		Bracelet bracelet3=new Bracelet("Gold", 15.0f, "platinum", false, true);
		Bracelet bracelet4=new Bracelet("Black", 30.0f, "platinum", true, false);
		
		Bracelet[] bracelets=new Bracelet[5];
		bracelets[0]=bracelet;
		bracelets[1]=bracelet1;
		bracelets[2]=bracelet2;
		bracelets[3]=bracelet3;
		bracelets[4]=bracelet4;
		for(int i=0; i<bracelets.length;i++) {
			Bracelet b=bracelets[i];
			if(b!=null) {
				System.out.println(b.getColor());
			}else {
				System.err.println("index is null".concat(String.valueOf(i)));
			}
		}

	}

}
