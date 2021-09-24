class Theatre{
String name="PVR";
String owner="Varsha";
String gstno="158XH67VB";
String location="Bengaluru";

//Default Constructor
public void Theatre(){
System.out.println("These are the Theatre Details");
}
//Method 
public void TheatreDetails(){
System.out.println("Theatre name: "+name);
System.out.println("Owner name: "+owner);
System.out.println("GST number of Theatre: "+gstno);
System.out.println("Theatre located in: "+location);
}
//Parameterized Constructor
public void Theatre(int noOfShows, int noOfSeats, int noOfScreen, boolean parking){
System.out.println("Number of Shows available are: "+noOfShows);
System.out.println("Number of seats available are: "+noOfSeats);
System.out.println("Number of screens available are: "+noOfScreen);
System.out.println("Parking available in the theatre: "+parking);
}
//Parameterized Method
public void Movie(String a, String b, String c){
String movieRating=a;
System.out.println("The rating of movies in theatre are: "+movieRating);
String showTiming=b;
System.out.println("The show timing of the current movie released is: "+showTiming);
String rating=c;
System.out.println("The rating of theatre is: "+rating);
}

public static void main(String args[]){
Theatre t=new Theatre();
t.Theatre();
System.out.println();
t.TheatreDetails();
System.out.println();
t.Theatre(4,100,5,true);
System.out.println();
t.Movie("3 star","2:30 pm","4 star");
}
}