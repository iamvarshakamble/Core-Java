package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.Fish;
import com.xworkz.inheritance.shop.GoldFish;
import com.xworkz.inheritance.shop.SharkFish;

public class FishStarter {

	public static void main(String[] args) {
		Fish fish=new Fish();
		System.out.println(fish.alive);
	    System.out.println(fish.region);
	    
	    SharkFish sharkFish=new SharkFish();
	    System.out.println(sharkFish.height);
	    System.out.println(sharkFish.weight);
	    
	    GoldFish goldFish=new GoldFish();
	    System.out.println(goldFish.color);
	    System.out.println(goldFish.size);
	}

}
