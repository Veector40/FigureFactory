package com.FigureFactory.singleFigureFactories.RandomFactories;

import com.FigureFactory.Figures.FigureInstances.Rectangle;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class RandomRectangleFactory implements SingleFigureFactory {
    public RandomRectangleFactory() {
    }

    @Override
    public Rectangle createInstance() {
        return new Rectangle(Math.random(), Math.random());
    }
}
