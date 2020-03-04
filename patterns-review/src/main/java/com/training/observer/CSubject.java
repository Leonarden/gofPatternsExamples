package com.training.observer;
import java.util.*;

class CSubject implements CObservable{
    private List<CObserver> observers = new ArrayList<CObserver>();
    private Double data = 0.0;
    
    public void register(CObserver o){
        observers.add(o);
    }
    public void unregister(CObserver o){
        int i =    observers.indexOf(o);
    
        observers.remove(i);
    }
    
    public void notify(CObserver o) throws Exception{
          o.update();
    }
    
    public void notifyAllObservers() throws Exception {
        for(CObserver o:observers)
          this.notify(o);
    }
    
    public void computeMetrics(){
        try{
        long bunch = System.currentTimeMillis()/2;
        data = data + new Double(bunch);
        this.notifyAllObservers();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public Double getData() {
        return this.data;
    }
}