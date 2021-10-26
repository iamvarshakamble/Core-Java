package com.xworkz.dp;

import com.xworkz.dp.dto.BusDriverDTO;

public class BusDriverStarter {

	public static void main(String[] args) {
		BusDriverDTO busDriverDTO=new BusDriverDTO("Varsha", 5, 2000.0d,"BMTC",21,"Bengaluru","8 hours");
		BusDriverDTO busDriverDTO1=new BusDriverDTO("Vaishnavi", 4, 1000.0d,"BMTC",22,"Bengaluru","8 hours");
		BusDriverDTO busDriverDTO2=new BusDriverDTO("Adarsh", 3, 20000.0d,"BMTC",20,"Bengaluru","8 hours");
		BusDriverDTO busDriverDTO3=new BusDriverDTO("Vartika", 2, 5000.0d,"BMTC",19,"Bengaluru","8 hours");
		BusDriverDTO busDriverDTO4=new BusDriverDTO("Pavan", 1, 200.0d,"BMTC",30,"Bengaluru","8 hours");
		
		BusDriverDTO[] busDriver=new BusDriverDTO[5];
		busDriver[0]=busDriverDTO;
		busDriver[1]=busDriverDTO1;
		busDriver[2]=busDriverDTO2;
		busDriver[3]=busDriverDTO3;
		busDriver[4]=busDriverDTO4;
		
		for(int i=0;i<busDriver.length;i++) {
			BusDriverDTO driver=busDriver[i];
			
			if(driver!=null) {
				System.out.println(driver.getDriverName());
			}else {
				System.out.println("index is null");
			}
		}

	}

}
