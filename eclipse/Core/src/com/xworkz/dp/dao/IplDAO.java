package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTO;

public class IplDAO {
 private IplDTO[] iplDTOs=new IplDTO[20];
 private int count;
 
 public void save(IplDTO dto) {
	if(dto!=null && this.count<iplDTOs.length ) {
		this.iplDTOs[count++]=dto;
		System.out.println("The added name is: ".concat(dto.getTeamName()));
	}else {
		System.err.println("Array is full or dto is null");
	}
 }
 
 public void create(int index, IplDTO dto) {
	if(dto!=null && index<iplDTOs.length && index>=0) {
		this.iplDTOs[index]=dto;
		System.out.println("The added index and teamname are ".concat(String.valueOf(index).concat(" and ").concat(dto.getTeamName())));				
		this.count++;
	}else {
		System.err.println("Invalid index");
	}
 }
 
 public int IndexOccupied() {
	return this.count;
 }
 
 public boolean matching(String teamName) {
	 for(int i=0;i<iplDTOs.length;i++) {
		 IplDTO ref=iplDTOs[i];
		 
		 if(ref!=null) {
			 System.out.println("ref is"+i);
			 String tempName=ref.getTeamName();
			 System.out.println(tempName);
			 if(tempName.equals(teamName)) {
				 System.out.println("Name found");
				 return true;
			 }
		 }
	 }
	 
	 return false;
 }
}
