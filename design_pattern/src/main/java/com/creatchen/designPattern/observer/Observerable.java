package com.creatchen.designPattern.observer;

import java.util.Observer;

/**
 * Created by creatchen on 2018/6/12.
 */
public interface Observerable {
    void registerObserver(Observer observer);

    void deleteObserver(Observer observer);

    void nodifyObserver();

    void nodifyObserver(Object obj);
}
