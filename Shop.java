class Shop{

public Shop(){
System.out.println("Default Constructor");
}

public Shop(String Sname){
this(5);
System.out.println("Para Constructor "+Sname);
}

public Shop(int id){
this();
System.out.println("Para Constructor "+id);
}

public static void main(String args[]){
	Shop s=new Shop("Sangeeta");
	Shop s2=new Shop(63);
}
}