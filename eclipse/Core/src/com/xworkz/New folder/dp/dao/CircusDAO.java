package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;

public class CircusDAO {
	private CircusDTO[] circusDTOs=new CircusDTO[10];
	private int count;
	
	public void save(CircusDTO dto) {
		if(dto!=null && this.count<this.circusDTOs.length && this.count>=0) {
			this.circusDTOs[this.count++]=dto;
			System.out.println("The added name is: ".concat(dto.getOwner()));
		}else {
			System.err.println("Array is full and dto is null");
		}
	}
	
	public void create(int index, CircusDTO dto) {
		if(dto!=null && index<this.circusDTOs.length && index>=0) {
			this.circusDTOs[index]=dto;
			System.out.println("The added index and name are: ".concat(String.valueOf(index).concat(" and ").concat(dto.getOwner())));
			this.count++;
		}else {
			System.err.println("Invalid index or name is null");
		}
	}
	
	public int indexOccupied() {
		return this.count;
	}
	
	public boolean matching(String ownerName) {
		
		for(int i=0;i<circusDTOs.length;i++) {
			CircusDTO ref=circusDTOs[i];
			
			if(ref!=null) {
				System.out.println("ref is: ".concat(String.valueOf(i)));
				String tempName=ref.getOwner();
				System.out.println(tempName);
				if(tempName.equals(ownerName)) {
					System.out.println("Name found");
					return true;
				}
			}
		}
		return false;
	}
}
