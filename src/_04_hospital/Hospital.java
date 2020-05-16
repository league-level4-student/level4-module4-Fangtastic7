package _04_hospital;

import java.util.ArrayList;


public class Hospital {

	ArrayList<Doctor> doctorlist = new ArrayList<Doctor>();
	ArrayList<Patient> plist = new ArrayList<Patient>();
	public void addDoctor(Doctor newdoctor) {
		// TODO Auto-generated method stub
		doctorlist.add(newdoctor);
	}

	public ArrayList getDoctors() {
		// TODO Auto-generated method stub
		return doctorlist;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		plist.add(patient);
	}

	public ArrayList getPatients() {
		// TODO Auto-generated method stub
		return plist;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for(Doctor doctor : doctorlist) {
			doctor.assignPatient(plist);
		}
	}

	

	

}
