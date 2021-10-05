class SugarFactoryStarter{
	public static void main(String args[]){
		SugarFactory ref=new SugarFactory();
		ref.capacity=2000;
		System.out.println(ref.capacity);
		System.out.println(ref.machine);
		ref.machine=new Machine();
		Machine machine=ref.machine;
		System.out.println(ref.machine);
		machine.Working=true;
		System.out.println(machine.Working);
}
}