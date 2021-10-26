package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {
	private WalletDTO[] walletDTOs=new WalletDTO[10];
	int count=0;
	
	public void save(WalletDTO dto) {
		if(dto!=null && this.count<walletDTOs.length && this.count>=0) {
			this.walletDTOs[count++]=dto;
			System.out.println("The added array is".concat(dto.getCompanyName()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public void create(int index, WalletDTO dto) {
		if(dto!=null && index<walletDTOs.length && index>=0) {
			this.walletDTOs[index]=dto;
			System.out.println("The added index and name are ".concat(String.valueOf(index).concat(" and ").concat(dto.getCompanyName())));
			this.count++;
		}else {
			System.err.println("index is invalid");
		}
	}
	
	
	public int IndexOccupied() {
		return this.count;
	}
	
	public boolean matching(String name) {
		for(int i=0;i<walletDTOs.length;i++) {
			WalletDTO ref=walletDTOs[i];
			
			if(ref!=null) {
				System.out.println("ref is ".concat(String.valueOf(i)));
				String tempName=ref.getCompanyName();
				System.out.println(tempName);
				if(tempName.equals(name)) {
					System.out.println("Name found");
					return true;
			}
				
			}
		}
		return false;
	}
}
