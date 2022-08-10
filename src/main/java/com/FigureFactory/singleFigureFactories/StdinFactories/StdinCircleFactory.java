package com.FigureFactory.singleFigureFactories.StdinFactories;

import com.FigureFactory.Figures.FigureInstances.Circle;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class StdinCircleFactory implements SingleFigureFactory {
    private final double radius;

    public StdinCircleFactory(String stdinSide) {
        this.radius = Double.parseDouble(stdinSide);
    }

    @Override
    public Circle createInstance() {
        return new Circle(radius);
    }
}
