package com.FigureFactory.FigureFactories;

import com.FigureFactory.FigureFactories.FigureFactories.FigureFactory;

public class FactoryCreator {
    public static FigureFactory createFactory(String factoryType) {
        try {
            Class<?> typeFactory = Class.forName("com.FigureFactory.FigureFactories.FigureFactories.FigureFactoryInstances." + factoryType + "FigureFactory");
            if (FigureFactory.class.isAssignableFrom(typeFactory)) {
                return (FigureFactory) typeFactory.getConstructor().newInstance();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
