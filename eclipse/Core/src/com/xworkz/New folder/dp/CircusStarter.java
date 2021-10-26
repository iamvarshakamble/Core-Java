package com.xworkz.dp;

import com.xworkz.dp.dao.CircusDAO;
import com.xworkz.dp.dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {
		CircusDTO circusDTO=new CircusDTO("Soubhagyalaxmi", 5000f, 3, 100, 2);
		CircusDTO circusDTO1=new CircusDTO("Akshata", 5000f, 3, 100, 2);
		CircusDTO circusDTO2=new CircusDTO("Tejaswini", 5000f, 3, 100, 2);
		CircusDTO circusDTO3=new CircusDTO("Sangeeta", 5000f, 3, 100, 2);
		CircusDTO circusDTO4=new CircusDTO("Soubhagyalaxmi", 5000f, 3, 100, 2);
		
		CircusDAO circusDAO=new CircusDAO();
		
		circusDAO.save(circusDTO);
		circusDAO.save(circusDTO1);
		circusDAO.save(circusDTO2);
		circusDAO.save(circusDTO3);
		circusDAO.save(circusDTO4);
		
		System.out.println();
		
		circusDAO.create(3, new CircusDTO("Soubhagyalaxmi", 5000f, 3, 100, 2));
		
		System.out.println();
		
		int indexOccupied=circusDAO.indexOccupied();
		System.out.println("".concat(String.valueOf(indexOccupied)));
		
		System.out.println();
		
		boolean owner=circusDAO.matching("Akshata");
		System.out.println(owner);
	}

}
