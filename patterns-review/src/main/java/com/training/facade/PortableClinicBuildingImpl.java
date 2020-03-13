package com.training.facade;

public class PortableClinicBuildingImpl {
	private int hours = 0;
	private ClinicPersonnel personnel;
	private ClinicalHardware clinicalHardware;
	boolean closed = true;
	public void setHours(int h) {
		hours = h;
	}
	
	public ClinicPersonnel getPersonnel() {
		return personnel;
	}
	public void setPersonnel(ClinicPersonnel personnel) {
		this.personnel = personnel;
	}
	public ClinicalHardware getClinicalHardware() {
		return clinicalHardware;
	}
	public void setClinicalHardware(ClinicalHardware clinicalHardware) {
		this.clinicalHardware = clinicalHardware;
	}
	
	public void cleanBuilding() {
		System.out.println("Cleaning disco building");
	}

	public void open() {
		this.closed = false;
		personnel.open();
		clinicalHardware.start();
	}
	
	public void start() throws Exception {
		int k = 0;
		while(k<hours&&!closed) {
			if(k%2==0)
				clinicalHardware.work();
			else
			personnel.startCaring();
		k++;
		}
	}
	
	public void close() {
		this.closed = true;
		personnel.close();
		clinicalHardware.stop();
		System.out.println("Building closed!");
	}
}
