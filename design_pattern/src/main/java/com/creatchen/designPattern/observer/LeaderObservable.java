package com.creatchen.designPattern.observer;

import java.util.Observable;

/**
 * Created by creatchen on 2018/6/12.
 */
public class LeaderObservable extends Observable {

    private String name;

    public LeaderObservable(String name) {
        this.name = name;
    }

    @Override
    public void notifyObservers(Object arg) {
        super.setChanged();
        super.notifyObservers(arg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
