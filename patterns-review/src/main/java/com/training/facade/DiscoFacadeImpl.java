package com.training.facade;

public class DiscoFacadeImpl implements DiscoFacade {

	private DiscoBuilding building;
	private Bar bar;
	private MusicSystem musicSystem;
	private boolean closed = true;
	private int hours = 0;
	
	public DiscoFacadeImpl(int hours,DiscoBuilding building, MusicSystem ms, Bar b) {
		this.hours = hours;
		this.building = building;
		this.bar = b;
		this.musicSystem = ms;
	}
	
	public boolean prepare() {
		boolean s = false;
		try {
		building.setBar(this.bar);
		building.setMusicSystem(this.musicSystem);
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
			System.out.println("Disco is open");
			stat = true;
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return stat;
	}

	public boolean runDisco() {
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
