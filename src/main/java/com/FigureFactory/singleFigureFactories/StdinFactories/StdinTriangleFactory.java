package com.FigureFactory.singleFigureFactories.StdinFactories;

import com.FigureFactory.Figures.FigureInstances.Triangle;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class StdinTriangleFactory implements SingleFigureFactory {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public StdinTriangleFactory(String stdinSide){
        this.sideA = Double.parseDouble(stdinSide.split(" ")[0]);
        this.sideB = Double.parseDouble(stdinSide.split(" ")[1]);
        this.sideC = Double.parseDouble(stdinSide.split(" ")[2]);
    }

    @Override
    public Triangle createInstance() {
        return new Triangle(sideA, sideB, sideC);
    }
}
