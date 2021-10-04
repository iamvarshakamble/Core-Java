class HelmetRunner{
public static void main(String args[]){
	Helmet h=new Helmet();
	Helmet h1=new Helmet();
	Helmet h2=new Helmet();
	
	h.name="Vega";
	h.weight=100f;
	h.thick=true;
	h.color="black";
	h.type=HelmetType.HALFFACE;
	
	h1.name="THH";
	h1.weight=200f;
	h1.thick=false;
	h1.color="white";
	h1.type=HelmetType.FULLFACE;
	
	h2.name="Royal Enfield";
	h2.weight=200f;
	h2.thick=false;
	h2.color="white";
	h2.type=HelmetType.FULLFACE;
	
	h.protect();
	System.out.println();
	h1.precaution();
	System.out.println();
	h2.protect();
	
}
}