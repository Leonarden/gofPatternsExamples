package com.training.mvc;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModel model = new BeatModelImpl();
		BeatController controller = new BeatControllerImpl(model);

	}

}
