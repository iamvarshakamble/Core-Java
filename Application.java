class Application{
	String name;
	float version;
	Company company;
	
	void displayDetails(){
		System.out.println("Details of Application");
		System.out.println(this.name);
		System.out.println(this.version);
		System.out.println(this.company);
		System.out.println();
	}
}