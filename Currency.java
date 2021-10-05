class Currency{
	String name;
	Country country;
	String value;
	
	void displayDetails(){
		System.out.println("Details of Currency");
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.value);
		System.out.println();
	}
}