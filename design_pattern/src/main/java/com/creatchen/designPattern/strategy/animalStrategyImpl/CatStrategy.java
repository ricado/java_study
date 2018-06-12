package com.creatchen.designPattern.strategy.animalStrategyImpl;

import com.creatchen.designPattern.strategy.AnimalStrategy;

public class CatStrategy implements AnimalStrategy {
    @Override
    public void hello() {
        System.out.println("hello, i am cat");
    }
}
