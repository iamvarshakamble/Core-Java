package com.xworkz.dp;
import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;

public class LawyerStarter {

	public static void main(String[] args) {
		LawyerDTO lawyerDTO=new LawyerDTO("Varsha", "LLB", 10, "Female", 40, "High Court", 5, 2);
		LawyerDTO lawyerDTO1=new LawyerDTO("Vaishnavi", "LLB", 20, "Female", 40, "High Court", 11, 3);
		LawyerDTO lawyerDTO2=new LawyerDTO("Adarsh", "LLB", 11, "Male", 40, "High Court", 6, 4);
		LawyerDTO lawyerDTO3=new LawyerDTO("Vartika", "LLB", 13, "Female", 40, "High Court", 6, 5);
		LawyerDTO lawyerDTO4=new LawyerDTO("Pavan", "LLB", 15, "Male", 40, "High Court", 10, 6);
		LawyerDTO lawyerDTO5=new LawyerDTO("Puneet", "LLB", 30, "Male", 40, "High Court", 20, 7);
		LawyerDTO lawyerDTO6=new LawyerDTO("Pooja", "LLB", 35, "Female", 40, "High Court", 15, 8);
		LawyerDTO lawyerDTO7=new LawyerDTO("Veena", "MBBS", 16, "Female", 40, "High Court", 45, 9);
		LawyerDTO lawyerDTO8=new LawyerDTO("Shrusti", "LLB", 17, "Female", 40, "High Court", 25, 10);
		LawyerDTO lawyerDTO9=new LawyerDTO("Sheetal", "LLB", 100, "Female", 40, "High Court", 25, 11);
		
		LawyerDAO lawyerDAO=new LawyerDAO();
		
		lawyerDAO.save(lawyerDTO);
		lawyerDAO.save(lawyerDTO1);
		lawyerDAO.save(lawyerDTO2);
		lawyerDAO.save(lawyerDTO3);
		lawyerDAO.save(lawyerDTO4);
		lawyerDAO.save(lawyerDTO5);
		lawyerDAO.save(lawyerDTO6);
		lawyerDAO.save(lawyerDTO7);
		lawyerDAO.save(lawyerDTO8);
		lawyerDAO.save(lawyerDTO9);
		
		System.out.println();
		
		lawyerDAO.delete(3);
		System.out.println();
		
		lawyerDAO.save(lawyerDTO6, 3);
		System.out.println();
	
	    boolean name=lawyerDAO.search("Varsha");
	    System.out.println(name);
	    System.out.println();
	    
	    boolean caseWon=lawyerDAO.searchcase(20);
	    System.out.println(caseWon);
	    System.out.println();
	    
	    int experience=lawyerDAO.getExperienceByname("Pavan");
	    System.out.println(experience);
	    System.out.println();
	    
	    String qualification=lawyerDAO.getQualificationByName("Sheetal");
	    System.out.println(qualification);
	    System.out.println();
	    
	   
	    lawyerDAO.getLawyerWithMaxExp();	    
	}

}
