class GuitarStarter{
	public static void main(String args[]){
		Guitar guitar=new Guitar(5000.0f);
		guitar.brand="Yamaha";
		guitar.noOfStrings=6;
		guitar.cost=7000.0f;
		
		Guitar guitar1=new Guitar(2000.0f);
		System.out.println(guitar1.brand);
		guitar1.brand="Casio";
		guitar1.noOfStrings=4;
		guitar1.cost=900.0f;
		
		System.out.println(guitar.brand);
	}
}