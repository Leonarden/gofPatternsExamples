package com.training.mvc;

public interface BeatModel {
	
	public void initialize();
	public void on();
	public void off();
	public void registerObserver(BPMObserver observer);
	public void registerObserver(BeatObserver observer);
	public void removeObserver(BPMObserver observer);
	public void removeObserver(BeatObserver observer);
	public void notifyBPMObservers();
	public void notifyBeatObservers();
	public void setBPM(int bpm);
	public int getBPM();
	
}
