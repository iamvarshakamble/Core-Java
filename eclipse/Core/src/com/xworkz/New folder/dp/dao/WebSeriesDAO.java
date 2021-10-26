package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {
	private WebSeriesDTO[] webSeriesDTOs=new WebSeriesDTO[10];
	private int count=0;
	
	public void save(WebSeriesDTO dto) {
		if(dto!=null && this.count<this.webSeriesDTOs.length) {
		this.webSeriesDTOs[count++]=dto;
		System.out.println("The series name ".concat(dto.getName()));
		
	    }else {
	    	System.err.println("array is full or dto is null");
	    }
	}
	
	public void create(WebSeriesDTO dto, int index) {
		if(dto!=null && index<this.webSeriesDTOs.length && index>=0) {
		 this.webSeriesDTOs[index]=dto;
		 System.out.println("added to "+index);
		 this.count++;
		}
	}
	
	public void delete(int index) {
		if(index>0 && index<webSeriesDTOs.length) {
		this.webSeriesDTOs[index]=null;
		System.out.println("The deleted index is: ".concat(String.valueOf(index)));
		System.out.println();
		}else {
			System.err.println("invalid index");
		}
	}
	 
	public void update(int index, WebSeriesDTO name) {
		if(index>0 && index<webSeriesDTOs.length && name!=null) {
		this.webSeriesDTOs[index]=name;
		System.out.println("The updated index is ".concat(String.valueOf(index)));
		}else {
			System.err.println("invalid index or name");
		}
	}
	
	public int indexexOccupied() {
		
		return this.count;
	}
	
	public boolean match(String Name) {
		for(int i=0;i<this.webSeriesDTOs.length;i++) {
		WebSeriesDTO r=this.webSeriesDTOs[i];
		if(r!=null) {
			System.out.println("ref s not null"+i);
			String p=r.getName();
			System.out.println("matching".concat(p));
			if(Name.equals(p)) {
				System.out.println("found");
				return true;
			}
		}
		}
		return false;
	}
	
	public WebSeriesDTO[] getWebSeriesDTOs() {
		return webSeriesDTOs;
	}
}
