class MovieTicketRunner{
	
	public static void main(String args[]){
		MovieTicket movieTicket=new MovieTicket();
		movieTicket.movieName="Shershah";
        movieTicket.theater="PVR";
        movieTicket.price=280.0f;
        movieTicket.noOfSeats=50;
        movieTicket.type=MovieType.CLASSIC;
		
		movieTicket.displayDetails();
		movieTicket.printTotalPrice();
	}
}