package com.xworkz.dp;

import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {
		DressCodeDTO dressCodeDTO=new DressCodeDTO(3, "Velvet", "white", 10000F, "female");
		DressCodeDTO dressCodeDTO1=new DressCodeDTO(3, "Velvet", "black", 2000.0F, "male");
		DressCodeDTO dressCodeDTO2=new DressCodeDTO(5, "Velvet", "brown", 3000.0F, "female");
		DressCodeDTO dressCodeDTO3=new DressCodeDTO(3, "Velvet", "pink", 4000.0F, "male");
		DressCodeDTO dressCodeDTO4=new DressCodeDTO(6, "Velvet", "red", 5000.0F, "female");
		
		DressCodeDAO dressCodeDAO=new DressCodeDAO();
		dressCodeDAO.save(dressCodeDTO);
		dressCodeDAO.save(dressCodeDTO1);
		dressCodeDAO.save(dressCodeDTO2);
		dressCodeDAO.save(dressCodeDTO3);
		dressCodeDAO.save(dressCodeDTO4);
		
		dressCodeDAO.delete(3);
		dressCodeDAO.update(3, dressCodeDTO4);
		
		DressCodeDTO[] dtos=dressCodeDAO.getDressCodeDTOs();
		dtos[0]=dressCodeDTO;
		dtos[1]=dressCodeDTO1;
		dtos[2]=dressCodeDTO2;
		dtos[3]=dressCodeDTO3;
		dtos[4]=dressCodeDTO4;
		
		for(int i=0;i<dtos.length;i++) {
		DressCodeDTO ref=dtos[i];
		if(ref!=null) {
			System.out.println(ref.getColor());
			System.out.println(ref.getGender());
			System.out.println(ref.getMaterial());
			System.out.println(ref.getPrice());
			System.out.println(ref.getSize());
			System.out.println("-----------------------------");
		}else {
			System.err.println("array is null");
		}
	}
	}

}
