package _04_hospital;

import java.util.ArrayList;

public class Doctor {
ArrayList<Patient> waitinglist = new ArrayList<Patient>();
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
			return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(waitinglist.size() == 3) {
			throw new DoctorFullException();
		} 
		waitinglist.add(patient);
		 
	if(waitinglist.size()==4) {
		waitinglist.remove(3);
	}
		
	}
		

	public ArrayList getPatients() {
		// TODO Auto-generated method stub
		return waitinglist;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
	for(Patient patient: waitinglist) {
		patient.checkPulse();
	}
	}

	

}
