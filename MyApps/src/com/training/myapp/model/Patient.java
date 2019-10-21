package com.training.myapp.model;

import java.util.Comparator;
import java.util.Objects;

public class Patient implements Comparable<Patient> {
	private String patientName;
	private int patientStatus;

	public Patient(String patientName, int patientStatus) {
		super();
		this.patientName = patientName;
		this.patientStatus = patientStatus;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(int patientStatus) {
		this.patientStatus = patientStatus;
	}

	public Patient() {
		super();
	}

	@Override
	public String toString() {
		//return "Patient [patientName=" + patientName + ", patientStatus=" + patientStatus + "]";
	return patientName;
	}

	public int compareTo(Patient p1) {
		// TODO Auto-generated method stub
//		return this.getPatientName().compareTo(o1.getPatientName());
		return Integer.compare( p1.patientStatus,this.patientStatus);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient p1=(Patient)obj;
		if(this.patientStatus==p1.patientStatus)
			
			return true;
		else
			return false;
		
		
	}

	@Override
	public int hashCode() {

		return Objects.hash(patientName, patientStatus);
	}
	public static class PatientSatusCmparator implements Comparator<Patient>{

		@Override
		public int compare(Patient patient1, Patient patient2) {
			// TODO Auto-generated method stub
			return Integer.compare(patient1.patientStatus, patient2.patientStatus);
		}
		
	}

}
