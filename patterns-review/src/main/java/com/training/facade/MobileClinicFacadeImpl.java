package com.training.facade;

public class MobileClinicFacadeImpl implements MobileClinicFacade {

	private PortableClinicBuildingImpl building;
	private ClinicPersonnel personnel;
	private ClinicalHardware clinicalHardware;
	private boolean closed = true;
	private int hours = 0;
	
	public MobileClinicFacadeImpl(int hours,PortableClinicBuildingImpl building, ClinicalHardware ch, ClinicPersonnel p) {
		this.hours = hours;
		this.building = building;
		this.personnel = p;
		this.clinicalHardware = ch;
	}
	
	public boolean prepare() {
		boolean s = false;
		try {
		building.setPersonnel(this.personnel);
		building.setClinicalHardware(this.clinicalHardware);
		building.setHours(this.hours);
		building.cleanBuilding();
		s = true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return s;
	}

	public boolean open() {
		boolean stat = false;
		try {
			
			building.open();
			this.closed = false;
			System.out.println("Mobile clinic open!");
			stat = true;
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return stat;
	}

	public boolean work() {
	  boolean s = false;
	  try {
		  if(!this.closed) {
			  building.start();
			  s = true;
		  }
	  }catch(Exception ex) 
	  {ex.printStackTrace();}
	  
	  return s;
	}

	public void close() {
		
		this.closed = true;
		building.close();
		
	}

}
