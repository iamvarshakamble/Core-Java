package com.xworkz.dp;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dp.dto.DoctorDTo;

public class DoctorStarter {

	public static void main(String[] args) {
		DoctorDTo doctorDTo=new DoctorDTo("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		DoctorDTo doctorDTo1=new DoctorDTo("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		DoctorDTo doctorDTo2=new DoctorDTo("Rakesh", "MBBS", "Nimans", "male", 50000.0d, 40);
		DoctorDTo doctorDTo3=new DoctorDTo("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		DoctorDTo doctorDTo4=new DoctorDTo("Ramesh", "MBBS", "Kantirava", "male", 50000.0d, 40);
		
		DoctorDAO doctorDAO=new DoctorDAO();
		
		doctorDAO.save(doctorDTo);
		doctorDAO.save(doctorDTo1);
		doctorDAO.save(doctorDTo2);
		doctorDAO.save(doctorDTo3);
		doctorDAO.save(doctorDTo4);
		System.out.println();
		
		doctorDAO.create(3, doctorDTo);
		System.out.println();
		
		int indexOccupied=doctorDAO.indexOccupied();
		System.out.println("index occupied are"+indexOccupied);
		System.out.println();
		
		boolean name=doctorDAO.matching("Nimans");
		System.out.println(name);
		
	}

}
