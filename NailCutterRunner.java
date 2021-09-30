class NailCutterRunner{
	
	public static void main(String args[]){
		NailCutter n=new NailCutter();
		NailCutter n1=new NailCutter();
		NailCutter n2=new NailCutter();
		
		n.name="Outpick";
		n.sharpness=true;
		n.rate=100f;
		n.material="Steel";
		n.size=NailCutterSize.SMALL;
		
		n1.name="RunnerUp";
		n1.sharpness=false;
		n1.rate=200f;
		n1.material="Steel";
		n1.size=NailCutterSize.MEDIUM;
		
		n1.name="RunnerUp";
		n1.sharpness=true;
		n1.rate=300f;
		n1.material="Steel";
		n1.size=NailCutterSize.BIG;
		
		n.cut();
		System.out.println();
		n1.shaper();
		System.out.println();
		n2.cut();
	}
}