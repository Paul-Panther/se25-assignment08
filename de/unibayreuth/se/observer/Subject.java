package de.unibayreuth.se.observer;

import java.util.ArrayList;

public abstract class Subject {
    private int value;
    private ArrayList<Observer> observers;
    public void setValue(int value) {
        this.value = value;
        fireUpdate();
    }
    public int getValue() {
        return value;
    }

    public Subject() {
        value = 0;
        observers = new ArrayList<>();
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void fireUpdate() {
        System.out.println("Sending update to observers");
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
}
