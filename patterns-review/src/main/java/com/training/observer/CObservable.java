package com.training.observer;


public interface CObservable {
	public void notifyAllObservers() throws Exception;
    public void notify(CObserver o) throws Exception;

}
