package com.xworkz.dp;

import com.xworkz.dp.dto.CarpenterDTO;

public class CarpenterStarter {

	public static void main(String[] args) {
		CarpenterDTO carpenterDTO=new CarpenterDTO("Varsha", 5, 10000.0d, "interior", 20, "Bengaluru", "5 hours");
		CarpenterDTO carpenterDTO1=new CarpenterDTO("Vaishnavi", 3, 10000.0d, "furniture", 20, "Bengaluru", "5 hours");
		CarpenterDTO carpenterDTO2=new CarpenterDTO("Adarsh", 5, 10000.0d, "house", 21, "Bengaluru", "5 hours");
		CarpenterDTO carpenterDTO3=new CarpenterDTO("Vartika", 4, 10000.0d, "interior", 20, "Bengaluru", "5 hours");
		CarpenterDTO carpenterDTO4=new CarpenterDTO("Pavan", 5, 10000.0d, "furniture", 21, "Bengaluru", "5 hours");
		
		CarpenterDTO[] carpenterdto=new CarpenterDTO[5];
		carpenterdto[0]=carpenterDTO;
		carpenterdto[1]=carpenterDTO1;
		carpenterdto[2]=carpenterDTO2;
		carpenterdto[3]=carpenterDTO3;
		carpenterdto[4]=carpenterDTO4;
		
		for(int i=0;i<carpenterdto.length;i++) {
			CarpenterDTO carpenter= carpenterdto[i];
			
			if(carpenter!=null) {
				System.out.println(carpenter.getAge());
			}else {
				System.out.println("index is null");
			}
		}
	}
}
	
