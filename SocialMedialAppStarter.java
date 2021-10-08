class SocialMedialAppStarter{
	
	public static void main(String args[]){
		
		SocialMediaApp mediaApp=new SocialMediaApp();
		mediaApp.setName("Instagram");
		System.out.println(mediaApp.name);
		mediaApp.setSize(3.5f);
		System.out.println(mediaApp.size);
		mediaApp.setLanguage("Java");
		System.out.println(mediaApp.langauge);
		mediaApp.setPlatform("Windows");
		System.out.println(mediaApp.platform);
		mediaApp.setVersion(3.1f);
		System.out.println(mediaApp.version);
		Company1 comp=new Company1();
		mediaApp.setCompany(comp);
		System.out.println(mediaApp.company);
		
		
		comp.setName("Facebook");
		//System.out.println(comp.name);
		System.out.println(mediaApp.company.name);
		comp.setFounder("Mark ZuckerBerg");
		System.out.println(mediaApp.company.founder);
		comp.setEst(2004);
		System.out.println(mediaApp.company.est);
		comp.setNoOfEmployees(60000);
		System.out.println(mediaApp.company.noOfEmployees);
		comp.setHeadQuaters("USA");
		System.out.println(mediaApp.company.headQuaters);
		comp.setRevenue(8596.5f);
		System.out.println(mediaApp.company.revenue);
		comp.setNoOfBranches(10);
		System.out.println(mediaApp.company.noOfBranches);

	}
}