package com.training.mvc;

public class BeatControllerImpl implements BeatController {

	BeatModel model;
	DJView view;
	
	public BeatControllerImpl(BeatModel model) {
		this.model = model;
		view = new DJView(this,model);
		view.createView();
		view.createControls();
		view.disableStartMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}
	
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
		
	}
	
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
	
	public void increaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm+1);
	}
	
	public void decreaseBPM() {
		int bpm = model.getBPM();
		if(bpm>0)
		model.setBPM(bpm - 1);
	}


public void setBPM(int bpm) {
	model.setBPM(bpm);
}


}
