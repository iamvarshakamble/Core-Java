package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DressCodeDTO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class DressCodeDAO {
	private DressCodeDTO[] dressCodeDTOs=new DressCodeDTO[10];
	private int count=0;
	
	public void save(DressCodeDTO dto) {
		if(dto!=null) {
		this.dressCodeDTOs[count++]=dto;
		System.out.println(dto.getPrice());
		}else {
			System.err.println("array is full or dto is null");
		}
	}
	
	public void delete(int index) {
		if(index>0 && index<dressCodeDTOs.length) {
		this.dressCodeDTOs[index]=null;
		System.out.println("The deleted index is ".concat(String.valueOf(index)));
		}else {
			System.err.println("index is null");
		}
	}
	
	public void update(int index, DressCodeDTO name) {
		if(index>0 && index<dressCodeDTOs.length && name!=null) {
		this.dressCodeDTOs[index]=name;
		System.out.println("The updated index is ".concat(String.valueOf(index)));
		}else {
			System.err.println("invalid index or name");
		}
	}
	
	public DressCodeDTO[] getDressCodeDTOs() {
		return dressCodeDTOs;
	}
}
