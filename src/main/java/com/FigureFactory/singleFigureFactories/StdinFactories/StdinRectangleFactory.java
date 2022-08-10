package com.FigureFactory.singleFigureFactories.StdinFactories;

import com.FigureFactory.Figures.FigureInstances.Rectangle;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class StdinRectangleFactory implements SingleFigureFactory {
    private final double sideA;
    private final double sideB;

    public StdinRectangleFactory(String sides) {
        this.sideA = Double.parseDouble(sides.split(" ")[0]);
        this.sideB = Double.parseDouble(sides.split(" ")[1]);
    }

    @Override
    public Rectangle createInstance() {
        return new Rectangle(sideA, sideB);
    }
}
