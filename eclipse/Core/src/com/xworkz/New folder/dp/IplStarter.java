package com.xworkz.dp;

import com.xworkz.dp.dao.IplDAO;
import com.xworkz.dp.dto.IplDTO;

public class IplStarter {

	public static void main(String[] args) {
		IplDTO iplDTO=new IplDTO("RCB", 3, 24, "USL", "Vivo");
		IplDTO iplDTO1=new IplDTO("MI", 3, 24, "USL", "Vivo");
		IplDTO iplDTO2=new IplDTO("CSK", 3, 24, "USL", "Vivo");
		IplDTO iplDTO3=new IplDTO("KKR", 3, 24, "USL", "Vivo");
		IplDTO iplDTO4=new IplDTO("SH", 3, 24, "USL","Vivo");


		IplDAO iplDAO=new IplDAO();
		
		iplDAO.save(iplDTO);
		iplDAO.save(iplDTO1);
		iplDAO.save(iplDTO3);
		iplDAO.save(iplDTO2);
		iplDAO.save(iplDTO4);
		
		System.out.println();
		
		iplDAO.create(10,new IplDTO("RR", 3, 24, "USL", "Vivo") );
		
		System.out.println();

		int IndexOccupied=iplDAO.IndexOccupied();
		System.out.println("The occupied indexes are: ".concat(String.valueOf(IndexOccupied)));
		System.out.println();
		
		boolean name=iplDAO.matching("MI");
		System.out.println(name);
	}

}
