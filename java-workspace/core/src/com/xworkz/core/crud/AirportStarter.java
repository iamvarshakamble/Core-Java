package com.xworkz.core.crud;

import com.xworkz.core.crud.operators.AirportOperator;

public class AirportStarter {

	public static void main(String[] args) {
AirportOperator airport = new AirportOperator();
		
		
		airport.addAirport("Emirates");
		airport.addAirport("Indian Airways");
		airport.addAirport("Singapore Airlines");
		airport.addAirport("Kingfisher");
		airport.addAirport("Indigo");
		airport.addAirport("pinnacle Air");
		airport.addAirport("vistara");
		airport.addAirport("Deccan Airline");
		airport.delete(5);
		airport.update(2, "Aksh");
		airport.displaydetails();

	}

}
