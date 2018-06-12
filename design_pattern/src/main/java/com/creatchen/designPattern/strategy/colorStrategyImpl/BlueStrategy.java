package com.creatchen.designPattern.strategy.colorStrategyImpl;

import com.creatchen.designPattern.strategy.ColorStrategy;

public class BlueStrategy implements ColorStrategy {
    @Override
    public void print() {
        System.out.println("hello,i am blue!");
    }
}
