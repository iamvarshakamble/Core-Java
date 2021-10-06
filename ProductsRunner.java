class ProductsRunner{
	public static void main(String args[]){
		Products products=new Products("Hair Dyrer","EC",300.0f,3,"Philips");
		products.displayDetails();
		products.printTotalCost();
		
		Products products1=new Products("Trimmer",500.0f,5);
		products.displayDetails();
		products.printTotalCost();
		
		Products.printTotalProductsPrice();
	}
}