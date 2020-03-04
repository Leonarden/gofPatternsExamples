package com.training.observer;

import java.io.*;
import java.util.*;




class CSuscriber implements CObserver {
    String id;
    CSubject subject;
    boolean registered = false;
    Double data = 0.0;
    public CSuscriber(String id,CSubject sub){
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