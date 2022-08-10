package com.FigureFactory.singleFigureFactories.RandomFactories;

import com.FigureFactory.Figures.FigureInstances.Triangle;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class RandomTriangleFactory implements SingleFigureFactory {
    public RandomTriangleFactory() {
    }

    @Override
    public Triangle createInstance() {
        return new Triangle(Math.random(), Math.random(), Math.random());
    }
}
