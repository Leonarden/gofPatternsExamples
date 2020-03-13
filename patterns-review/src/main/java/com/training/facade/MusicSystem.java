package com.training.facade;

import java.util.Random;

public class MusicSystem {

	String[] songs = {"Rihanna","David Getta","Bob Sinclair"};
	Boolean stop = false;
	
	public String playSong() {
		Random rand = new Random(100);
		int i =  Math.abs(rand.nextInt()%3);
		String s = "Playing now: " + songs[i] + "";
		return s;
	}
	public void startMusic() {
		System.out.println("Starting music");
		stop = false;
	}
	public void playMusic() throws Exception{
		System.out.println("Playing music:");
		int k = 0;
		while(!stop && k<10) {
			System.out.println(playSong());
			k++;
		}
	}
	
	public void stopMusic() {
		System.out.println("Stopping music");
		stop = true;
	}
}
