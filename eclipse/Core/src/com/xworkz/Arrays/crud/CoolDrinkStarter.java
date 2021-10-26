package com.xworkz.core.Arrays.crud;

import com.xworkz.core.Arrays.crud.operations.Cooldrink;

public class CoolDrinkStarter {

	public static void main(String[] args) {
		Cooldrink drink=new Cooldrink();
		drink.addBrand("pepsi");
		drink.addBrand("fAnta");
		drink.addBrand("Dew");
		drink.addBrand("coco cola");
		drink.addBrand("Kingfisher");
		drink.addBrand("Sting");
		drink.addBrand("Mirinda");
		
		drink.deleteReference(8);
	
		drink.displayBrand();
		drink.updateBrand(2, null);	

	}

}
