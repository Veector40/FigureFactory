package com.FigureFactory.singleFigureFactories.RandomFactories;

import com.FigureFactory.Figures.FigureInstances.Circle;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class RandomCircleFactory implements SingleFigureFactory {
    public RandomCircleFactory() {
    }

    @Override
    public Circle createInstance() {
        return new Circle(Math.random());
    }
}
