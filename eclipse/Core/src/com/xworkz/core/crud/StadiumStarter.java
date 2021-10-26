package com.xworkz.core.crud;

import com.xworkz.core.crud.operators.StadiumOperator;

public class StadiumStarter {

	public static void main(String[] args) {
		StadiumOperator operator = new StadiumOperator();

		operator.addStadiumName("Kantirava Stadium");
		operator.addStadiumName("NehARU Stadium");
		operator.addStadiumName("R N Shetty");
		operator.addStadiumName("xyz");
		operator.addStadiumName("abc");
		operator.deleteStadiumName(0);
		operator.updateStadiumName(0, "tej");
		operator.displayStadiumNames();

	}

}
