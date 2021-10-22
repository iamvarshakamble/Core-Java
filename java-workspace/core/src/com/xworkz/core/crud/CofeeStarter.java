package com.xworkz.core.crud;

import com.xworkz.core.crud.operators.CoffeOperator;

public class CofeeStarter {

	public static void main(String[] args) {
		CoffeOperator drink=new CoffeOperator();
		drink.addBrand("Bru");
		drink.addBrand("Nescafe");
		drink.addBrand("Levista");
		drink.addBrand("Mcafe");
		drink.deleteReference(8);
		drink.UpdateWork(3,null);
		drink.displayBrand();

	}

}
