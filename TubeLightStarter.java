class TubeLightStarter{
	public static void main(String args[]){
		TubeLight light=new TubeLight();
		String name=light.getName();
		System.out.println("Tubelight is "+name);
		light.setWatts(20);
		int wat=light.getWatts();
		System.out.println("Watt is "+wat);
	}
}