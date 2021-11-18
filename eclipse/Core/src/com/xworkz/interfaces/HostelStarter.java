package com.xworkz.interfaces;

import com.xworkz.interfaces.hostel.HostelRules;
import com.xworkz.interfaces.hostel.SharavatiHostel;
import com.xworkz.interfaces.hostel.VisitorRules;

public class HostelStarter {

	public static void main(String[] args) {
		HostelRules hostelRules=new SharavatiHostel();
		hostelRules.inTime();
		
        
		SharavatiHostel sharavatiHostel=new SharavatiHostel();
		sharavatiHostel.inTime();
		sharavatiHostel.visitDay();
		
		VisitorRules rules=new SharavatiHostel();
		rules.visitDay();
		
		Object object=new SharavatiHostel();
		
	}

}
