package com.xworkz.dp;

import com.xworkz.dp.dto.WebSeriesDTO;
import com.xworkz.dp.constants.Genre;
import com.xworkz.dp.dao.WebSeriesDAO;

public class WebSeriesStarter {

	public static void main(String[] args) {
		WebSeriesDTO webSeriesDTO=new WebSeriesDTO("The Vampire Dairies", Genre.THRILLER,"Damon", 80, 4.0F, 8, 7);
		WebSeriesDTO webSeriesDTO1=new WebSeriesDTO("Money Heist", Genre.CRIME,"Tokyo", 80, 4.0F, 8, 7);
		WebSeriesDTO webSeriesDTO2=new WebSeriesDTO("The Stranger things", Genre.THRILLER,"Ell", 80, 4.0F, 8, 7);
		WebSeriesDTO webSeriesDTO3=new WebSeriesDTO("The Originals", Genre.THRILLER,"Klaus", 80, 4.0F, 8, 7);
		WebSeriesDTO webSeriesDTO4=new WebSeriesDTO("The Family man", Genre.THRILLER,"Moosa", 80, 4.0F, 8, 7);
		WebSeriesDTO webSeriesDTO5=new WebSeriesDTO("Friends", Genre.THRILLER,"Rachel", 80, 4.0F, 8, 7);
		
		WebSeriesDAO webSeriesDAO=new WebSeriesDAO();
		
		webSeriesDAO.save(webSeriesDTO);
		webSeriesDAO.save(webSeriesDTO1);
		webSeriesDAO.save(webSeriesDTO2);
		webSeriesDAO.save(webSeriesDTO3);
		webSeriesDAO.save(webSeriesDTO4);
		webSeriesDAO.save(webSeriesDTO5);

		webSeriesDAO.delete(1);
		webSeriesDAO.update(3, webSeriesDTO5);
		
		WebSeriesDTO[] dtos=webSeriesDAO.getWebSeriesDTOs();
		dtos[0]=webSeriesDTO;
		dtos[1]=webSeriesDTO1;
		dtos[2]=webSeriesDTO2;
		dtos[3]=webSeriesDTO3;
		dtos[4]=webSeriesDTO4;
		dtos[5]=webSeriesDTO5;
		
		for(int i=0;i<dtos.length;i++) {
			WebSeriesDTO ref=dtos[i];
			
			if(ref!=null) {
				System.out.println(ref.getCast());
				System.out.println(ref.getCurrentSeason());
				System.out.println(ref.getName());
				System.out.println(ref.getNoOfCharacters());
				System.out.println(ref.getRating());
				System.out.println(ref.getTotalSeasons());
				System.out.println("----------------------------------------------------");
			}else {
				System.err.println("index is null");
			}
		}
	}

}
