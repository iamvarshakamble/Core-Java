class MovieTicket{

String movieName;
String theater;
float price;
int noOfSeats;
MovieType type;

void displayDetails(){
	System.out.println(this.movieName);
	System.out.println(this.theater);
	System.out.println(this.price);
	System.out.println(this.noOfSeats);
	System.out.println(this.type);
}

void printTotalPrice(){
	float total=this.price*this.noOfSeats;
	System.out.println("Total Price:"+total);
}
}