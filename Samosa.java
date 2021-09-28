class Samosa{
float cost;
boolean taste;
SamosaSize size;
String[] ingredients;

Samosa(float cost, boolean taste){
System.out.println("created using float,boolean");
this.cost=cost;
this.taste=taste;
}

Samosa(SamosaSize size, String[] ingredients){
System.out.println("created using SamosaSize,String[]");
this.size=size;
this.ingredients=ingredients;
}

Samosa(float cost, boolean taste,SamosaSize size, String[] ingredients){
this.size=size;
this.ingredients=ingredients;
System.out.println("created using float,boolean, SamosaSize,String[]");
}

}
