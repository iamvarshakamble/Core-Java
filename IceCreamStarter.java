class IceCreamStarter{
	public static void main(String args[]){
		IceCream cream=new IceCream(20,"vanila",Color.BLACK);
		System.out.println(cream.flavour);
		System.out.println(cream.temp);
		System.out.println(cream.type);
		System.out.println(cream.color);
		System.out.println(cream.brand);
		String flavour="ButterScoch";
		cream.type="Cone";
		System.out.println(cream.type);
		cream.brand=new Brand("Varsha","Kamble");
		Brand brand=cream.brand;
		brand.since=1947;
		//brand.name="Amul";
		System.out.println(cream.brand.name);
		System.out.println(brand.name);
		System.out.println(brand.ownerName);
		System.out.println(brand.location);
		System.out.println(brand.since);
		
	}
}