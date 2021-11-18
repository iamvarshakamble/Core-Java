package com.xworkz.interfaces;

import com.xworkz.interfaces.hostel.Hospital;
import com.xworkz.interfaces.hostel.HospitalAdmitRule;
import com.xworkz.interfaces.hostel.HospitalDischargeRule;
import com.xworkz.interfaces.hostel.Patient;

public class HospitalStarter {

	public static void main(String[] args) {
		
		HospitalAdmitRule admit=new Patient();
		HospitalDischargeRule discharge=new Patient();
		Hospital hospital=new Hospital("Varsha", "Bengaluru", true, admit, discharge);
		hospital.admitPatient();
		hospital.dischargePatient();
	}

}
