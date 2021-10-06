class Products{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float totalProductsPrice;
	
	Products(String name, String type, float price, int quantity, String vendor){
		this.name=name;
		this.type=type;
		this.price=price;
		this.vendor=vendor;
		this.quantity=quantity;
		
	}
	
	Products(String name, float price, int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
    
	void displayDetails(){
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.vendor);
	}
	
	void printTotalCost(){
		float total=this.price*this.quantity;
		System.out.println("Total Cost:"+total);
		totalProductsPrice=totalProductsPrice+total;
		System.out.println("Total Products Price: "+totalProductsPrice);
	}
	
	static void printTotalProductsPrice(){
		System.out.println("Total Products Price"+totalProductsPrice);
	}
}