package com.FigureFactory.singleFigureFactories.RandomFactories;

import com.FigureFactory.Figures.FigureInstances.Square;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class RandomSquareFactory implements SingleFigureFactory {
    public RandomSquareFactory() {
    }

    @Override
    public Square createInstance() {
        return new Square(Math.random());
    }
}
