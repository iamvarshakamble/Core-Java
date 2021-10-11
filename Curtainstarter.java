class Curtainstarter{
	public static void main(String args[]){
		Curtain curtain=new Curtain();
		curtain.setBrand("DDecor");
		String brand=curtain.getBrand();
	    System.out.println(brand);
		curtain.setColor("Blue");
		String color=curtain.getColor();
		System.out.println(color);
		curtain.setLength("4 inch");
		String length=curtain.getLength();
		System.out.println(length);
		curtain.setStaning(true);
		boolean value=curtain.getStaning();
		System.out.println(value);
		curtain.setType("Pleated Curtains");
		String type=curtain.getType();
		System.out.println(type);
	}

}