class SamosaR{
public static void main(String[] args){

float cost=10.0f;
boolean taste=true;
Samosa s=new Samosa(cost,taste);
System.out.println(s.cost);
System.out.println(s.taste);
System.out.println(s.size);
System.out.println(s.ingredients);

String[] inc={"Potato","Onion","Chilly","Salt"};
Samosa s1=new Samosa(20.0f,false,SamosaSize.SMALL,inc);
System.out.println(s1.cost);
System.out.println(s1.taste);
System.out.println(s1.size);
System.out.println(s1.ingredients[0]);
}
}