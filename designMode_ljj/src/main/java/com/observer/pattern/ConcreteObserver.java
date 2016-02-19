package com.observer.pattern;

/**
 * Created by jingjlia on 2016/2/18.
 */
public class ConcreteObserver implements Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name,ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        this.observerState = this.subject.getSubjectState();
        System.out.println("The observer's state of " + this.name + " is "+this.observerState);
    }
}
