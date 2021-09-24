class Login{
int password;
String username;
boolean submit;

public void userInfo(){
password=123;
username="varshakamble";
submit=true;
System.out.println(password+" "+username+" "+submit);
}

public static void main(String args[]){
Login obj=new Login();
obj.userInfo();
System.out.println("password id: "+obj.password);
System.out.println("username is: "+obj.username);
System.out.println("Form submitted successfully "+obj.submit);
}
}