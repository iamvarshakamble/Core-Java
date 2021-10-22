package com.xworkz.dp;

import com.xworkz.dp.dto.SeasonDTO;

public class SeasonStarter {

	public static void main(String[] args) {
		SeasonDTO seasonDTO=new SeasonDTO("Summer", "April", "June", "Sunflower", false, 30.0f, "Mango");
		SeasonDTO seasonDTO1=new SeasonDTO("Winter", "April", "June", "Sunflower", false, 30.0f, "Mango");
		SeasonDTO seasonDTO2=new SeasonDTO("Rainy", "April", "June", "Sunflower", false, 30.0f, "Mango");
		SeasonDTO seasonDTO3=new SeasonDTO("Autumn", "April", "June", "Sunflower", false, 30.0f, "Mango");
		SeasonDTO seasonDTO4=new SeasonDTO("Spring", "April", "June", "Sunflower", false, 30.0f, "Mango");
		
		SeasonDTO[] seasondto=new SeasonDTO[5];
		seasondto[0]=seasonDTO;
		seasondto[1]=seasonDTO1;
		seasondto[2]=seasonDTO2;
		seasondto[3]=seasonDTO3;
		seasondto[4]=seasonDTO4;

		for(int i=0;i<seasondto.length;i++) {
			SeasonDTO season=seasondto[i];
			
			if(season!=null) {
				System.out.println(season.getSeasonName());
			}else {
				System.out.println("Index is full");
			}
		}
	}

}
