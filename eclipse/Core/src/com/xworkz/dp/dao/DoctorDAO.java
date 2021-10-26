package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTo;

public class DoctorDAO {
	private DoctorDTo[] doctorDTos=new DoctorDTo[10];
	private int count=0;
	
	public void save(DoctorDTo dto) {
		if(dto!=null && this.count<this.doctorDTos.length && this.count>=0) {
			this.doctorDTos[this.count++]=dto;
			System.out.println("The added names are: ".concat(dto.getHospitalName()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public void create(int index, DoctorDTo dto) {
		if(dto!=null && index<this.doctorDTos.length && index>=0) {
			this.doctorDTos[index]=dto;
			System.out.println("The added names are: ".concat(String.valueOf(index)).concat(" and ").concat(dto.getHospitalName()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public int indexOccupied() {
		return this.count;
	}
	
	public boolean matching(String name) {
		
		for(int i=0;i<doctorDTos.length;i++) {
			DoctorDTo ref=doctorDTos[i];
			
			if(ref!=null) {
				System.out.println("ref is".concat(String.valueOf(i)));
				String tempTime=ref.getHospitalName();
				System.out.println(tempTime);
				if(tempTime.equals(name)) {
					System.out.println("Time found");
					return true;
				}
			}
		}
		return false;
	}
}


