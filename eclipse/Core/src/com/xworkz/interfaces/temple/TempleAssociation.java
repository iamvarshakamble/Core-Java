package com.xworkz.interfaces.temple;

public class TempleAssociation {
	private DevoteeRule devoteeRule;
	private String associationName;
	
	public TempleAssociation() {
		System.out.println("Invoke Temple Association");
	}

	public TempleAssociation(DevoteeRule devoteeRule, String associationName) {
		super();
		this.devoteeRule = devoteeRule;
		this.associationName = associationName;
	}
	
	public void allowDevotees() {
		System.out.println("Temple Name: "+associationName);
		System.out.println("Invoke allowDevotees");
		if(this.devoteeRule!=null) {
			System.out.println("invoked devotee rule");
			boolean slipperOff=this.devoteeRule.slipperOff();
			if(slipperOff) {
				System.out.println("Slippers are off");
				boolean photo=this.devoteeRule.dontTakePhoto();
				boolean silence=this.devoteeRule.maintainSilence();
				if(photo && silence) {
					System.out.println("Good Devotee");
				}else {
					System.err.println("Bad Devotee");
				}
			}else {
				System.err.println("Please leave your slippers outside");
			}
		}else {
			System.err.println("give the rules");
		}
	}
}
