package com.training.command;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CarRaceControl {
	CarAccelerateCommand[] accelerate; 
	CarDecelerateCommand[] decelerate;
	CarStopCommand[] stop;
	double[] avgspeed;
	int[]totalmoves;
	int numOfCar = 0;
	public CarRaceControl( int numOfCar) {
	    this.numOfCar = numOfCar;
		accelerate = new CarAccelerateCommand[numOfCar];
		decelerate = new CarDecelerateCommand[numOfCar];
		stop = new CarStopCommand[numOfCar];
		avgspeed = new double[numOfCar];
		totalmoves = new int[numOfCar];
		
		for(int i=0;i< numOfCar;i++) {
			CarEngine engine = new CarEngine();	
			accelerate[i] = new CarAccelerateCommand(engine);
			decelerate[i] = new CarDecelerateCommand(engine);
			stop[i] = new CarStopCommand(engine);
	}
}
	
	public void race(int timelong) {
		
		Random rand = new Random(numOfCar);
		Random rmoves = new Random(3);
		
		while(timelong>0) {
			
		
		int p = Math.abs(rand.nextInt()%numOfCar);
		
		int m = Math.abs(rmoves.nextInt()%3);
		if( m==0){
			accelerate[p].execute();
			avgspeed[p]= (avgspeed[p] + accelerate[p].getSpeed())/2;
		 }
		if(m==1){
			 decelerate[p].execute();
			 avgspeed[p]= (avgspeed[p] + decelerate[p].getSpeed())/2;
				
		}
		if(m==3) {
			 stop[p].execute();
			 avgspeed[p]= (avgspeed[p] + stop[p].getSpeed())/2;
			
		}
		timelong--;
		}
		
	
		double max = 0; int pos = 0;
		for(int i=0;i<numOfCar;i++) {
			System.out.print("Car " +i+ "Speed " + avgspeed[i]);
			if(avgspeed[i]>max) {
				max = avgspeed[i];
				pos = i;
			}
		}
		System.out.println("");
		System.out.println("And the winner of the race is car number: " + pos + " with speed" + max );
			
		
	}
	
}