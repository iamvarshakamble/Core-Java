class CurrencyStarter{
	public static void main(String args[]){
		Currency currency=new Currency();
		currency.name="Rupee";
		currency.value="0.013 US Dollars";
		currency.country=new Country();
		Country country=currency.country;
		currency.displayDetails();
		
		
		country.name="India";
		country.code=91;
	    country.displayDetails();
		
		
        Application application=new Application();
        application.name="MS Word";
		application.version=1.8f;
		application.company=new Company();
		Company company=application.company;
		application.displayDetails();
		
       
        company.name="Microsoft";
        company.CEO="Satya Nadella";
        company.CFO="Amy Hood";
		company.country=currency.country;
        company.displayDetails();		
	}
}