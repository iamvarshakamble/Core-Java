class Phonepay{
void Phonepay()
{
System.out.println("This Is Phonepay");
}

void Phonepay(int amount){
System.out.println("The amount transacted successfully "+amount+" Rs");
}

public void Cashback(int b){
int Cash=b;
System.out.println("You have got cashback of Rs "+Cash);
}

public static void main(String args[]){
Phonepay p1=new Phonepay();
Phonepay p2=new Phonepay();
Phonepay p3=new Phonepay();
p1.Phonepay();
p2.Phonepay(5000);
p3.Cashback(5);
}
}