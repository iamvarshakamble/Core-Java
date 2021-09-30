class NailCutter{

String name;
boolean sharpness;
float rate;
String material;
NailCutterSize size;


void cut(){
System.out.println("Invoked Nailcutter");
System.out.println("Nail Cutter is used to cut the nails");
System.out.println(name);
System.out.println(sharpness);
System.out.println(rate);
System.out.println(material);
System.out.println(size);
}

void shaper(){
System.out.println("Invoked Nailshaper");
System.out.println("Nail Cutter is used to shape the nails");
System.out.println(name);
System.out.println(sharpness);
System.out.println(rate);
System.out.println(material);
System.out.println(size);
}
}