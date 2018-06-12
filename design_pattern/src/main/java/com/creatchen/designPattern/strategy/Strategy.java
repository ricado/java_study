package com.creatchen.designPattern.strategy;

import java.lang.reflect.InvocationTargetException;

public interface Strategy<T> {

    public Class<T> getStrategyClass();

    public static Object createStrategy(Strategy strategy) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return strategy.getStrategyClass().getConstructor().newInstance();
    }

    default T newInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return this.getStrategyClass().getConstructor().newInstance();
    }
}
