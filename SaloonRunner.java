class SaloonRunner{
	public static void main(String args[]){
		Saloon saloon=new Saloon();
		saloon.name="Green Trends";
		saloon.location="BTM";
		saloon.openTime=9.00f;
		saloon.closeTime=8.00f;
		saloon.branch=SaloonBranch.BTM;
		
		Saloon saloon1=new Saloon();
		saloon1.name="Green Trends";
		saloon1.location="JPNAGAR";
		saloon1.openTime=10.00f;
		saloon1.closeTime=9.00f;
		saloon1.branch=SaloonBranch.JPNAGAR;
		
		saloon.haircut();
		System.out.println();
		saloon1.haircut();
	}
}