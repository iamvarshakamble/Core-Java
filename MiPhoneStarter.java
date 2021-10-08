class MiPhoneStarter{
	
	public static void main(String args[]){
		
		MiPhone mi=new MiPhone();
		mi.setBrand("Chinese");
		System.out.println(mi.brand);
		mi.setPrice(15000.0);
		System.out.println(mi.price);
		mi.setColor("Moonlight Black");
		System.out.println(mi.color);
		mi.setImei(18999);
		System.out.println(mi.imei);
		PhonePay1 pay=new PhonePay1();
		mi.setPhonepay(pay);
		System.out.println(mi.phonePay);
		
		pay.setCompany("Chinese");
		//System.out.println(pay.company);
		System.out.println(mi.phonePay.company);
		pay.setVersion("122.2v");
		System.out.println(mi.phonePay.version);
		pay.setArchitect("Varsha");
		System.out.println(mi.phonePay.architect);
		pay.SetWorking(true);
		System.out.println(mi.phonePay.working);
	}
}