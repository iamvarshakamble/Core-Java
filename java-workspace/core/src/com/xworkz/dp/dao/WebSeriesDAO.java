package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {
	private WebSeriesDTO[] webSeriesDTOs=new WebSeriesDTO[10];
	private int count=0;
	
	public void save(WebSeriesDTO dto) {
		if(dto!=null) {
		this.webSeriesDTOs[count++]=dto;
		System.out.println("The series name ".concat(dto.getName()));
		
	    }else {
	    	System.err.println("array is full or dto is null");
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
	
	public WebSeriesDTO[] getWebSeriesDTOs() {
		return webSeriesDTOs;
	}
}
