class FoodItemRunner{
	
	public static void main(String args[]){
		
		FoodItem foodItem=new FoodItem();
		foodItem.name="Gobi Manchurian";
		foodItem.price=65.0f;
		foodItem.hotelName="Chinese Corner";
		foodItem.quantity=5;
		foodItem.type=Type.CHINESE;
		foodItem.rating="4.5 star";
		foodItem.orderType=OrderType.DELIVERY;
		
		foodItem.printNameAndPrice();
		foodItem.printHotelName();
		foodItem.printTotalPrice();
		foodItem.printTotalFoodItemsPrice();
		
		
		
	}
}