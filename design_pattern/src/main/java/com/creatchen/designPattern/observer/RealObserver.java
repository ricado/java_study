package com.creatchen.designPattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by creatchen on 2018/6/12.
 */
public class RealObserver implements Observer {

    private String name;

    public RealObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        LeaderObservable leaderObservable = (LeaderObservable) o;
        System.out.println(name + ",您收到一条信息:" + leaderObservable.getName() + "说:" + arg.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
