package com.training.facade;

public class DiscoBuilding {
	private int hours = 0;
	private Bar bar;
	private MusicSystem musicSystem;
	boolean closed = true;
	public void setHours(int h) {
		hours = h;
	}
	
	public Bar getBar() {
		return bar;
	}
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	public MusicSystem getMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}
	
	public void cleanBuilding() {
		System.out.println("Cleaning disco building");
	}

	public void open() {
		this.closed = false;
		bar.open();
		musicSystem.startMusic();
	}
	
	public void start() throws Exception {
		int k = 0;
		while(k<hours&&!closed) {
			if(k%2==0)
				musicSystem.playMusic();
			else
			bar.runBar();
		k++;
		}
	}
	
	public void close() {
		this.closed = true;
		bar.close();
		musicSystem.stopMusic();
		System.out.println("Building closed!");
	}
}
