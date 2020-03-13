package com.training.facade;

public class Launcher {
/**
 * Facade pattern example (simplifies the interface of a more complex system )
 * @param args
 */
	public static void main(String[] args) {
	
		ClinicPersonnel personnel = new ClinicPersonnel();

		ClinicalHardware clinicalHardware = new ClinicalHardware();
		
		PortableClinicBuildingImpl building = new PortableClinicBuildingImpl();
		
		MobileClinicFacade mobileClinic = new MobileClinicFacadeImpl(8,building, clinicalHardware,personnel);
		
		try {
			if(!mobileClinic.prepare())
				throw new Exception("Can't prepare Mobile Clinic");
			Thread.sleep(100);
			
			mobileClinic.open();
			
			if(!mobileClinic.work())
				throw new Exception("A problem occurred starting work");
			Thread.sleep(300);		
			
			mobileClinic.close();
			
		}catch(Exception ex) 
			{ex.printStackTrace();
		}
		
		
	}

}
