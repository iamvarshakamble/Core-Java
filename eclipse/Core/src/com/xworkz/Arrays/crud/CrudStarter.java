package com.xworkz.core.Arrays.crud;
import com.xworkz.core.Arrays.crud.operations.*;
public class CrudStarter {
	public static void main(String[] args) {
          BeachOpeartor beachOperator=new BeachOpeartor();
         
          String cname=beachOperator.getCountry();
          System.out.println(cname);
       
          
          beachOperator.addBeachName("Om");
          beachOperator.addBeachName("Malpe");
          beachOperator.addBeachName("Kudle");
          beachOperator.addBeachName("Gokarna");
          beachOperator.addBeachName("Karwar");
          beachOperator.addBeachName("Karwar");//calling the method again to see the else part
          beachOperator.displayBeachName();
          System.out.println();
          
          Chocolate chocolate=new Chocolate();
          String choconame=chocolate.getChocolateCompany();
          System.out.println(choconame);
          
          chocolate.addChocolateName("Dairy Milk");
          chocolate.addChocolateName("Milky Bar");
          chocolate.addChocolateName("Kit kat");
          chocolate.addChocolateName("Snickers");
          chocolate.addChocolateName("Fusion");
          chocolate.displayChocolateName();
          System.out.println();
          
          GinOperator ginOperator=new GinOperator();
          String gname=ginOperator.getGinDrink();
          System.out.println(gname);
          
          ginOperator.addGinBrandName("Beefeater");
          ginOperator.addGinBrandName("Bombay Sapphire");
          ginOperator.addGinBrandName("The Botanist");
          ginOperator.addGinBrandName("Roku");
          ginOperator.addGinBrandName("Ophir");
          ginOperator.displayGinBrandName();
          System.out.println();
          
          RestaurantOperator restaurantOperator=new RestaurantOperator();
          String rname=restaurantOperator.getRestaurantName();
          System.out.println(rname);
          
          restaurantOperator.addRestaurantBranch("Udupi");
          restaurantOperator.addRestaurantBranch("Bengaluru");
          restaurantOperator.addRestaurantBranch("Mysore");
          restaurantOperator.addRestaurantBranch("Hubli");
          restaurantOperator.addRestaurantBranch("Dharwad");
          restaurantOperator.displayRestaurantBranch();
          System.out.println();
          
          RocketOperator rocketOperator=new RocketOperator();
          String rocketName=rocketOperator.getRocketLocation();
          System.out.println(rocketName);
          
          rocketOperator.addRocketName("GSAT-30");
          rocketOperator.addRocketName("RISAT-2BR1");
          rocketOperator.addRocketName("Cartost-3");
          rocketOperator.addRocketName("Chandrayaan");
          rocketOperator.addRocketName("Chandrayaan2");
          rocketOperator.displayRocketName();
          System.out.println();
          
          ResortOperator resortOperator=new ResortOperator();
          String resName=resortOperator.getResortName();
          System.out.println(resName);
          
          resortOperator.addResortLocation("Bengaluru");
          resortOperator.addResortLocation("Mumbai");
          resortOperator.addResortLocation("Mysore");
          resortOperator.addResortLocation("Kochi");
          resortOperator.addResortLocation("Hyderabad");
          resortOperator.displayResortLocation();
          System.out.println();
          
          IslandOperator islandOperator=new IslandOperator();
          String iname=islandOperator.getIslandCountry();
          System.out.println(iname);
          
          islandOperator.addIslandName("Gotland");
          islandOperator.addIslandName("Oland");
          islandOperator.addIslandName("Faro");
          islandOperator.addIslandName("Gotska Sandon");
          islandOperator.addIslandName("Stora Karlso");
          islandOperator.displayIslandName();
          System.out.println();
          
          WaterFallOperator waterfallOperator=new WaterFallOperator();
          String wname=waterfallOperator.getWaterfallCountry();
          System.out.println(wname);
          
          waterfallOperator.addWaterfallName("Dudhsagar Falls");
          waterfallOperator.addWaterfallName("Jog Falls");
          waterfallOperator.addWaterfallName("Kunchikal Falls");
          waterfallOperator.addWaterfallName("Shirle falls");
          waterfallOperator.addWaterfallName("Amboli falls");
          waterfallOperator.displayWaterfallName();
	}
}
