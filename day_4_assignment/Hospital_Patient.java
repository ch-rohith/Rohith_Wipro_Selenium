package day_4_assignment;

class Hospital {
	 String hospitalName = "City Hospital";
	 String location = "Chennai";

	 void showHospitalDetails() {
	     System.out.println("Hospital: " + hospitalName);
	     System.out.println("Location: " + location);
	 }
	}
	//Subclass
	class Patient extends Hospital {
	 String patientName = "Yash";

	 void showPatientDetails() {
	     System.out.println("Patient Name: " + patientName);
	 }
	}
	public class Hospital_Patient {
	 public static void main(String[] args) {
	     Patient p = new Patient();
	     p.showPatientDetails();
	     p.showHospitalDetails(); 
	 }
	}