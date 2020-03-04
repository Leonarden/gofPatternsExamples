package com.training.observer;



import java.io.*;
import java.util.*;

 interface Observer{
    public void update();
}

 interface Observable {
    public void notifyAllObservers() throws Exception;
    public void notify(Observer o) throws Exception;
}
class Suscriber implements Observer {
    String id;
    Subject subject;
    boolean registered = false;
    Double data = 0.0;
    public Suscriber(String id,Subject sub){
        this.id = id;
        subject = sub;    
    
        subject.register(this);
        registered = true;
    }

    public void update() {
        if(registered){
            data = subject.getData();
        }
        display();
    }
    
    void display(){
        System.out.println("Suscriber:" + id + " updated");
        System.out.println("Current DATA: " + data);
    }
}
class Subject implements Observable{
    private List<Observer> observers = new ArrayList<Observer>();
    private Double data = 0.0;
    
    public void register(Observer o){
        observers.add(o);
    }
    public void unregister(Observer o){
        int i =    observers.indexOf(o);
    
        observers.remove(i);
    }
    
    public void notify(Observer o) throws Exception{
          o.update();
    }
    
    public void notifyAllObservers() throws Exception {
        for(Observer o:observers)
          this.notify(o);
    }
    
    public void computeMetrics(){
        try{
        long bunch = System.currentTimeMillis()/2;
        data = data + new Double(bunch);
        this.notifyAll();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public Double getData() {
        return this.data;
    }
}

class ObserverTestDrive {
	public static void main (String[] args) {
		
		Subject subject = new Subject();
		
		long transmission = 10000;
		
		Suscriber norths = new Suscriber("NorthStation",subject);
		Suscriber wests = new Suscriber("WestStation",subject);
		Suscriber souths = new Suscriber("SouthStation",subject);
		
		for(int i=0;i<transmission;i++)
		    subject.computeMetrics();
		
		
		
		
		
		
		
		
		
		
	}
}