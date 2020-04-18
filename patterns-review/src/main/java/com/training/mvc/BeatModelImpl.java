package com.training.mvc;

import javax.sound.midi.*;
import java.util.*;

public class BeatModelImpl implements BeatModel, MetaEventListener{
Sequencer sequencer;
ArrayList beatObservers = new ArrayList();
ArrayList bpmObservers = new ArrayList();
int bpm = 90;

Sequence sequence;
Track track;

public void initialize() {
	setUpMidi();
	buildTrackAndStart();
	
}

public void on() {
	sequencer.start();
	setBPM(90);
}

public void off() {
	setBPM(0);
	sequencer.stop();
}
	
public void setBPM(int bpm) {
	this.bpm = bpm;
	sequencer.setTempoInBPM(this.bpm);
	notifyBPMObservers();
}


public int getBPM() {
	return bpm;
}

void beatEvent() {
	notifyBeatObservers();
}

public void registerObserver(BeatObserver be) {
	beatObservers.add(be);
}

public void notifyBeatObservers() {
	
	Iterator it = this.beatObservers.iterator();
	while(it.hasNext()) {
		((BeatObserver)it.next()).updateBeat();
	}
	
	
	
}

public void registerObserver(BPMObserver bp) {
	this.bpmObservers.add(bp);
	
}


public void notifyBPMObservers() {
	Iterator it = bpmObservers.iterator();
	for(int i = 0;it.hasNext();i++) {
		((BPMObserver) it.next()).updateBPM();
	}
	
	
}


public void removeObserver(BeatObserver ob) {
 int idx = 	this.beatObservers.indexOf(ob);
		 if(idx>=0)
		 this.beatObservers.remove(idx);
}


public void removeObserver(BPMObserver op) {
 int idx = 	this.bpmObservers.indexOf(op);
		 if(idx>=0)
		 this.bpmObservers.remove(idx);
}

public void meta(MetaMessage message) {
if(message.getType()==47) {
	beatEvent();
	sequencer.start();
	setBPM(getBPM());
}

}
public void setUpMidi() {
	try {
		
		sequencer = MidiSystem.getSequencer();
		sequencer.open();
		sequencer.addMetaEventListener(this);
		sequence = new Sequence(Sequence.PPQ,4);
		sequencer.setTempoInBPM(getBPM());
		
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	
	
	
}

public void buildTrackAndStart() {
	
	int[] trackList = {35,0,46,0};
	
	sequence.deleteTrack(null);
	track = sequence.createTrack();
    makeTracks(trackList);
    track.add(makeEvent(192,9,1,0,4));
    try {
    	
    	sequencer.setSequence(sequence);
    	
    }catch(Exception ex) {
    	ex.printStackTrace();
    }
	
	
	
	
	
}

public void makeTracks(int [] list) {
	for(int i=0;i<list.length;i++) {
		
		int key = list[i];
		if(key!=0) {
			track.add(makeEvent(144,9,key,100,i));
			track.add(makeEvent(128,9,key,100,i+1));
		}
		
	}
	
}


public MidiEvent makeEvent(int comd, int channel, int one, int two, int tick) {
	MidiEvent event = null;
	try {
		ShortMessage sm = new ShortMessage(comd, channel, one, two);
		event = new MidiEvent(sm,tick);
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	
	
	return event;
	
}




	
}
