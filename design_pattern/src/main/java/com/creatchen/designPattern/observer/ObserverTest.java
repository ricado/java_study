package com.creatchen.designPattern.observer;

import java.util.Observer;

/**
 * Created by creatchen on 2018/6/12.
 */
public class ObserverTest {

    public static void main(String[] args) {
        LeaderObservable lukeObservable = new LeaderObservable("luke");

        Observer realObserver1 = new RealObserver("creatchen");
        Observer realObserver2 = new RealObserver("dasonzheng");
        Observer realObserver3 = new RealObserver("jeckzeng");
        Observer realObserver4 = new RealObserver("sophili");
        Observer realObserver5 = new RealObserver("jinshixue");

        lukeObservable.addObserver(realObserver1);
        lukeObservable.addObserver(realObserver2);
        lukeObservable.addObserver(realObserver3);
        lukeObservable.addObserver(realObserver4);
        lukeObservable.addObserver(realObserver5);

        lukeObservable.notifyObservers("今天我请客");

        System.out.println("---------------一天后-----------------");
        ////////////////////////////////////////////////////
        lukeObservable.deleteObserver(realObserver4);
        lukeObservable.notifyObservers("今天我请客");


    }
}
