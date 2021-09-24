class AC{
static void rating(){
String rate="3.5 stars";
System.out.println("The rating given to the AC is "+rate);
cooling();
}

static void cooling(){
String temperature="24C";
System.out.println("The cooling is "+temperature);
}

static void companyName(){
String company="Whirlpool";
System.out.println("The name of the company is "+company);
rating();
}
public static void main(String args[]){
companyName();
}
}