class TrainRunner{
	public static void main(String args[]){
		Train train=new Train();
		train.transport="Hubli";
		train.transport();
		System.out.println();
		train.start();
		System.out.println();
		train.stop();
	}
}