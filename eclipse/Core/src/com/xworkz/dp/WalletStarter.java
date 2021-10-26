package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;
import com.xworkz.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {
		WalletDTO walletDTO=new WalletDTO("WILDHORN", "nylon", 2, 300.0F, 2);
		WalletDTO walletDTO1=new WalletDTO("Allen Solly", "leather", 2, 300.0F, 2);
		WalletDTO walletDTO2=new WalletDTO("WILDHORN", "nylon", 2, 300.0F, 2);
		WalletDTO walletDTO3=new WalletDTO("WILDHORN", "nylon", 2, 300.0F, 2);
		WalletDTO walletDTO4=new WalletDTO("Titan", "nylon", 2, 300.0F, 2);
		
		WalletDAO walletDAO=new WalletDAO();
		
		walletDAO.save(walletDTO);
		walletDAO.save(walletDTO1);
		walletDAO.save(walletDTO2);
		walletDAO.save(walletDTO3);
		walletDAO.save(walletDTO4);

		System.out.println();
		
		walletDAO.create(3, walletDTO4);
		
		System.out.println();
		
		int IndexOccupied=walletDAO.IndexOccupied();
		System.out.println("Index occupied are: ".concat(String.valueOf(IndexOccupied)));
		
		System.out.println();
		
		boolean name=walletDAO.matching("Titan");
		System.out.println(name);
	
	}

}
