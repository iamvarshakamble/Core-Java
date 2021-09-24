class GoodMorning{
static int a=2,b=3,sum,sub;

static void add(){
sum=a+b;
}

static int sub(){
sub=a-b;
return sub;
}

public static void main(String args[]){
System.out.println(sum); //prints default value
System.out.println(sub); //prints default value
add();
System.out.println(sum);
sub();
System.out.println(sub);
}
}