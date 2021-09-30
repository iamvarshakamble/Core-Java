class Train{
	String transport;
	
	void transport(){
		System.out.println("Invoked transport");
		System.out.println(transport);
		this.start();
	}
	
	static void start(){
		System.out.println("invoked start");
		stop();
	}
	
	static void stop(){
		System.out.println("invoked stop");
	}
}