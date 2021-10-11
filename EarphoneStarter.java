class EarphoneStarter{
	public static void main(String args[]){
		Earphone earphone=new Earphone();
		System.out.println(earphone.frequency);
		earphone.setFrequency(10.0f);
		System.out.println(earphone.frequency);
	}
}