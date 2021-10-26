package com.xworkz.core.crud;

import com.xworkz.core.crud.operators.CoolDrinkOperator;

public class ColdDrinkStarter {

	public static void main(String[] args) {
		CoolDrinkOperator drink=new CoolDrinkOperator();
		drink.addBrand("Dew");
		drink.addBrand("Pepsi");
		drink.addBrand("Mirinda");
		drink.addBrand("Sting");
		drink.addBrand("Fanta");
		drink.addBrand("Slice");
		drink.addBrand("Frooti");	
		drink.deleteReference(8);
		drink.UpdateBrand(3,null);
		drink.displayBrandNames();
	}

}
