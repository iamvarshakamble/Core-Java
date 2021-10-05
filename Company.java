class Company{
	String name;
	Country country;
	String CEO;
	String CFO;
	
	void displayDetails(){
		System.out.println("Details of Company");
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.CEO);
		System.out.println(this.CFO);
		System.out.println();
	}
}