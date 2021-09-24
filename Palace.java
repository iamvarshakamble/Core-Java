class Varsha{

static int doy;
static boolean work;

static int DateOfYear(int DOY){
doy=DOY;
return doy;
}

static boolean working(boolean a){
work=a;
return work;
}

static void display(){
System.out.println("Date of Year"+doy);
System.out.println("She is available for work"+work);
}
}