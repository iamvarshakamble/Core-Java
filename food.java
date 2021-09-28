class food{
String taste="good";
static void eating(){
System.out.println("This is static method");
}

void cooking(){
System.out.println("Taste is "+taste);
this.eating();
}
}