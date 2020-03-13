package com.training.facade;

public class Launcher {
/**
 * Facade pattern example (simplifies the interface of a more complex system )
 * @param args
 */
	public static void main(String[] args) {
	
		Bar bar = new Bar();

		MusicSystem musicSystem = new MusicSystem();
		
		DiscoBuilding building = new DiscoBuilding();
		
		DiscoFacade disco = new DiscoFacadeImpl(8,building, musicSystem,bar);
		
		try {
			if(!disco.prepare())
				throw new Exception("Can't prepare Disco");
			Thread.sleep(100);
			
			disco.open();
			
			if(!disco.runDisco())
				throw new Exception("A problem occurred starting the show");
			Thread.sleep(300);		
			
			disco.close();
			
		}catch(Exception ex) 
			{ex.printStackTrace();
		}
		
		
	}

}
