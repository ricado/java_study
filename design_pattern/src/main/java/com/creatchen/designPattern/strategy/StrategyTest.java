package com.creatchen.designPattern.strategy;

import com.creatchen.designPattern.strategy.animalStrategyImpl.AnimalEnum;
import com.creatchen.designPattern.strategy.animalStrategyImpl.CatStrategy;
import com.creatchen.designPattern.strategy.colorStrategyImpl.ColorEnum;
import com.creatchen.designPattern.strategy.colorStrategyImpl.RedStrategy;

import java.lang.reflect.InvocationTargetException;

public class StrategyTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ColorStrategy colorStrategy = ColorEnum.GREEN.newInstance();

        Enum.valueOf(ColorEnum.class,"RED");

        ColorEnum.valueOf("RED").newInstance();

        colorStrategy.print();

//        int size = 100 * 100 * 1000;
//int size = 1;
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < size; i++) {
//
//        }
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("test 耗时 = " + (endTime - startTime) + " ms");
//
//        noUseStratrgy(size);
//        useStrategy(size);
//
//        int sumOfxy = OperateEnum.valueOf("ADD").opera(1,2);
//
//        System.out.println("sumOfxy = " + sumOfxy);
    }

    public static void noUseStratrgy(int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {

            String color = "blue";
            ColorStrategy colorStrategy = new RedStrategy();
//        colorStrategy.print();
            AnimalStrategy animalStrategy = new CatStrategy();
//        animalStrategy.hello();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("noUseStratrgy 耗时 = " + (endTime - startTime) + " ms");
    }

    public static void useStrategy(int size) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {

            String color = "blue";
            ColorStrategy colorStrategy = (ColorStrategy) Strategy.createStrategy(ColorEnum.valueOf(color.toUpperCase()));
//        colorStrategy.print();
            AnimalStrategy animalStrategy = (AnimalStrategy) Strategy.createStrategy(AnimalEnum.MONKEY);
//        animalStrategy.hello();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("useStrategy 耗时 = " + (endTime - startTime) + " ms");
    }

}
