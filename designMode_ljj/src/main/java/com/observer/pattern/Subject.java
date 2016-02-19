package com.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingjlia on 2016/2/18.
 */
public interface Subject {
    List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyall();
}
