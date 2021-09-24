class Ghost{

void Ghost(){
System.out.println("This is default constructor");
}

void Ghost(String name){
System.out.println("This is parameterized constructor "+name);
}

public static void main(String args[]){
Ghost G=new Ghost();
G.Ghost();
G.Ghost("varsha");
}
}