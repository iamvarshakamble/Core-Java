package com.xworkz.interfaces;

import com.xworkz.interfaces.hostel.DevoteeRule;
import com.xworkz.interfaces.hostel.PublicDevoteeRule;
import com.xworkz.interfaces.hostel.TempleAssociation;

public class TempleStarter {

	public static void main(String[] args) {
		
		DevoteeRule devoteeRule=new PublicDevoteeRule();
		TempleAssociation templeAssociation=new TempleAssociation(devoteeRule,"Iskcon");
		templeAssociation.allowDevotees();
	}

}
