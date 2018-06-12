package com.creatchen.designPattern.strategy.colorStrategyImpl;

import com.creatchen.designPattern.strategy.ColorStrategy;

public class GreenStrategy implements ColorStrategy {
    @Override
    public void print() {
        System.out.println("hello,i am green!");
    }
}
