package com.xworkz.dp;

import com.xworkz.dp.dto.CraneDTO;

public class CraneStarter {

	public static void main(String[] args) {
		CraneDTO craneDTO=new CraneDTO("Cherry", "152cm", 6.8f, "brownish", "Amazon Forest", false, "flying bird");
		CraneDTO craneDTO1=new CraneDTO("Chinky", "153cm", 6.8f, "white", "Daintree Forest", false, "flying bird");
		CraneDTO craneDTO2=new CraneDTO("Pinky", "152cm", 6.9f, "gray", "Amazon Forest", true, "flying bird");
		CraneDTO craneDTO3=new CraneDTO("Ricky", "154cm", 6.8f, "gray", "Sundarbans Forest", true, "flying bird");
		CraneDTO craneDTO4=new CraneDTO("Pari", "152cm", 6.10f, "white", "Amazon Forest", true, "flying bird");
        
		CraneDTO[] cranedto=new CraneDTO[5];
		cranedto[0]=craneDTO;
		cranedto[1]=craneDTO1;
		cranedto[2]=craneDTO2;
		cranedto[3]=craneDTO3;
		cranedto[4]=craneDTO4;
		
		for(int i=0;i<cranedto.length;i++) {
			CraneDTO crane=cranedto[i];
			
			if(crane!=null) {
				System.out.println(crane.getForest());
			}else {
				System.out.println("index is full");
			}
		}
	}
}
