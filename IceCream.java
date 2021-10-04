class IceCream{
	String flavour="ButterScoch";
	float temp;
	String type;
	Color color;
	Brand brand;
	
	
	IceCream(float temp){
		this.temp=temp;
	}
	
	IceCream(float temp, String flavour, Color color){
		this(temp);
		this.flavour=flavour;
		this.color=color;
	}
}