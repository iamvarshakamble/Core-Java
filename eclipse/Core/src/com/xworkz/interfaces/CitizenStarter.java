package com.xworkz.interfaces;

import com.xworkz.interfaces.constants.Address;
import com.xworkz.interfaces.hostel.AfricanCitizen;
import com.xworkz.interfaces.hostel.IndianCitizen;
import com.xworkz.interfaces.hostel.MarriageRule;
import com.xworkz.interfaces.hostel.TrafficRule;
import com.xworkz.interfaces.hostel.VotingRule;

public class CitizenStarter {
	public static void main(String[] args) {
		TrafficRule trafficRule=new IndianCitizen("Varsha",Address.BENGALURU);
		 trafficRule.LicenseNo();
		 trafficRule.validInsurance();
		 trafficRule.validLicence();
		 
		 TrafficRule trafficRule2=new AfricanCitizen("Vaishnavi", "Kenya");
		 trafficRule2.LicenseNo();
		 trafficRule2.validInsurance();
		 trafficRule2.validLicence();
		 
		 VotingRule votingRule=new IndianCitizen("Varsha", Address.BENGALURU);
		 votingRule.validAge();
		 votingRule.validId();
		 
		 VotingRule votingRule2=new AfricanCitizen("Vaishnavi", "Kenya");
		 votingRule2.validAge();
		 votingRule2.validId();
		 
		 MarriageRule marriageRule= new IndianCitizen("Varsha", Address.BENGALURU);
		 marriageRule.validAge('f', 21);
		 
		 MarriageRule marriageRule2=new AfricanCitizen("Vaishnavi", "Kenya");
		 marriageRule2.validAge('m', 25);
		
		 IndianCitizen indianCitizen=new IndianCitizen("Varsha", Address.HYDERABAD);
		 indianCitizen.displayDetails();
		 
		 AfricanCitizen africanCitizen=new AfricanCitizen("Vaishnavi", "Kenya");
		 africanCitizen.displayDetails();
		

	}

}
