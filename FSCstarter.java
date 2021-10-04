class FSCstarter{
	public static void main(String args[]){
		Forest forest=new Forest("Banglore",true);
		System.out.println(forest.name);
		System.out.println(forest.location);
		System.out.println(forest.reserved);
		System.out.println(forest.state);
		forest.state=new State(4,"Basavaraj Bommai");
		State state=forest.state;
		System.out.println(forest.state);
		System.out.println();
		System.out.println(state.name);
		System.out.println(state.noOfDistricts);
		System.out.println(state.cmName);
		System.out.println(state.capitalCity);
	    state.capitalCity=new CapitalCity(2000,"Dosa");
		CapitalCity capitalCity=state.capitalCity;
		System.out.println(state.capitalCity);
		System.out.println();
		System.out.println(capitalCity.name);
		System.out.println(capitalCity.population);
		System.out.println(capitalCity.famousFor);
	}
}