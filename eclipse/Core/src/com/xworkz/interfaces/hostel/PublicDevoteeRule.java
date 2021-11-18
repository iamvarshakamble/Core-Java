package com.xworkz.interfaces.hostel;

public class PublicDevoteeRule implements DevoteeRule {

	@Override
	public boolean slipperOff() {
		System.out.println("Invoked SlipperOff");
		return true;
	}

	@Override
	public boolean dontTakePhoto() {
		System.out.println("Invoked dontTakePhoto");
		return true;
	}

	@Override
	public boolean maintainSilence() {
		System.out.println("Invoked maintainSilence");
		return true;
	}

}
