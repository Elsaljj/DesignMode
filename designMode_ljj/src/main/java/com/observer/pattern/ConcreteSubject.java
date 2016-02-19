package com.observer.pattern;

/**
 * Created by jingjlia on 2016/2/18.
 */
public class ConcreteSubject implements Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyall() {
        for (Observer o:this.observers){
            o.update();
        }
    }
}
