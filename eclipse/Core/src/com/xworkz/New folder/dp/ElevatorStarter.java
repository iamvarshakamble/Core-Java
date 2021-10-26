package com.xworkz.dp;

import com.xworkz.dp.dto.ElevatorDTO;

public class ElevatorStarter {

	public static void main(String[] args) {
		ElevatorDTO elevatorDTO=new ElevatorDTO(false, 3, true, true, true, "traction", "Home");
		ElevatorDTO elevatorDTO1=new ElevatorDTO(false, 2, true, false, true, "traction", "Office");
		ElevatorDTO elevatorDTO2=new ElevatorDTO(true, 3, false, true, true, "traction", "Home");
		ElevatorDTO elevatorDTO3=new ElevatorDTO(false, 4, true, true, true, "traction", "School");
		ElevatorDTO elevatorDTO4=new ElevatorDTO(true, 3, false, false, true, "traction", "Apartment");
		
		ElevatorDTO[] elevatordto=new ElevatorDTO[5];
		elevatordto[0]=elevatorDTO;
		elevatordto[1]=elevatorDTO1;
		elevatordto[2]=elevatorDTO2;
		elevatordto[3]=elevatorDTO3;
		elevatordto[4]=elevatorDTO4;

		for(int i=0;i<elevatordto.length;i++) {
			ElevatorDTO elevator=elevatordto[i];
			
			if(elevator!=null) {
				System.out.println(elevator.getElevatorFor());
			}else {
				System.out.println("index is null");
			}
		}
	}

}
