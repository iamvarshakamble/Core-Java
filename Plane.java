class Plane{
static String Src_name="Bengaluru";
static String Des_name="Hyderabad";
static double Tick_price=10000.000d;

static void planeName(){
String planename="Jet Airways";
System.out.println("The Name of The plane is "+planename);
System.out.println(Src_name+" to "+Des_name);
}

static void typeClass(){
String typeclass="Business Class";
System.out.println("Class is "+typeclass);
System.out.println("Ticket is "+Tick_price);
}  

static void Food(){
boolean food=true;
System.out.println("Availability of food is "+food);
}

public static void main(String args[]){
planeName();
typeClass();
Food();
}
}