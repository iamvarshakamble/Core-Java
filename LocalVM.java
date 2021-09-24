class LocalVM{
static String name="Global";//Global Variable
public static void main(String args[]){
System.out.println("This is global variable"+name);
second();
//System.out.println("this is local variable"+name1);//Local variable cannot be accessed outside the methods
}
static void second(){
String name1="Local";//Local Variable
System.out.println("this is Second Method");
System.out.println("this is global variable"+name);
}
}