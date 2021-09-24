class Zoo{

public void Zoo(){
System.out.println("These are the details of two types afimals");
}

public void Carnivorous(String a, String b, String c, String d, String e){
System.out.println("The name of the animal is "+a);
System.out.println("The Date of Birth of the animal is "+b);
System.out.println("The Date of death of the animal is "+c);
System.out.println("The owner name of the animal is "+d);
System.out.println("The weight of the animal is "+e);
}

public void Herbivorous(String name, String dob, String dod, String owner, String weight){
System.out.println("The name of the animal is "+name);
System.out.println("The Date of Birth of the animal is "+dob);
System.out.println("The Date of death of the animal is "+dod);
System.out.println("The owner name of the animal is "+owner);
System.out.println("The weight of the animal is "+weight);
}

public static void main(String args[]){
Zoo z=new Zoo();
z.Zoo();
System.out.println();
z.Carnivorous("Lion","9/1989","10/2000","Varsha","100kg");
System.out.println();
z.Herbivorous("Jimmy","6/1989","1/2000","Varsha","110kg");
}
}
