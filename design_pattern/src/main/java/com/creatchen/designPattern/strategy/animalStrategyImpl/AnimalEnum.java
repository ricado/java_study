package com.creatchen.designPattern.strategy.animalStrategyImpl;

import com.creatchen.designPattern.strategy.AnimalStrategy;
import com.creatchen.designPattern.strategy.Strategy;

/**
 * 颜色策略的枚举类
 */
public enum AnimalEnum implements Strategy<AnimalStrategy>{

    DOG(DogStrategy.class),
    CAT(CatStrategy.class),
    MONKEY(MonkeyStrategy.class),
    A1(DogStrategy.class)
    ;

    private Class<AnimalStrategy> strategyClass;

    AnimalEnum(Class strategyClass) {
        this.strategyClass = strategyClass;
    }

    @Override
    public Class<AnimalStrategy> getStrategyClass() {
        return strategyClass;
    }
}
