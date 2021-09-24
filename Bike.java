class Ghost{

void Ghost(){
System.out.println("This is default constructor");
}

void Ghost(String name){
System.out.println("This is parameterized constructor");
}

public static void main(String args[]){
Ghost g=new Ghost();
}
}