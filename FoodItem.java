class FoodItem{
	String name;
	float price;
	String hotelName;
	int quantity;
	Type type;
	String rating;
	OrderType orderType;
	static float totalFoodPrice;
	
	void printNameAndPrice(){
		System.out.println("Food Item Name:"+name);
		System.out.println("Food price :"+price);
	}
	
	void printHotelName(){
		System.out.println("Hotel Name :"+hotelName);
	}
	
	void printTotalPrice(){
		float total=this.price*this.quantity;
		System.out.println("Total Price is :"+total);
		totalFoodPrice=totalFoodPrice+total;
	}
	
	void printTotalFoodItemsPrice(){
		System.out.println(totalFoodPrice);
	}
	
	
	
}