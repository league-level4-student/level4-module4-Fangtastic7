package _04_hospital;

public class DoctorFullException extends Exception {
	void terminate() {
		System.out.println("exit");
		System.exit(0);
	}
}
