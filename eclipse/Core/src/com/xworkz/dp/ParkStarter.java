package com.xworkz.dp;

import com.xworkz.dp.dto.ParkDTO;

public class ParkStarter {

	public static void main(String[] args) {
		ParkDTO parkDTO=new ParkDTO("Akshay Park", "Hubli", "10.00-5.00", 10, "Sunday", true, false);
		ParkDTO parkDTO1=new ParkDTO("Chetan Park", "Dharwad", "10.00-5.00", 7, "Sunday", true, true);
		ParkDTO parkDTO2=new ParkDTO("Akshay Park", "Dharwad", "10.00-5.00", 10, "Sunday", false, false);
		ParkDTO parkDTO3=new ParkDTO("Ganesh Park", "Hubli", "10.00-5.00", 5, "Sunday", true, true);
		ParkDTO parkDTO4=new ParkDTO("Kuvempu Park", "Bengaluru", "10.00-5.00", 10, "Sunday", true, true);
		
		ParkDTO[] parkdto=new ParkDTO[5];
		parkdto[0]=parkDTO;
		parkdto[1]=parkDTO1;
		parkdto[2]=parkDTO2;
		parkdto[3]=parkDTO3;
		parkdto[4]=parkDTO4;
		
		for(int i=0;i<parkdto.length;i++) {
			ParkDTO park=parkdto[i];
			
			if(park!=null) {
				System.out.println(park.getParkName());
			}else {
				System.out.println("index is null");
			}
		}
	}

}
