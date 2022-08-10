package com.FigureFactory.singleFigureFactories.StdinFactories;

import com.FigureFactory.Figures.FigureInstances.Square;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

public class StdinSquareFactory implements SingleFigureFactory {
    private final double side;
    public StdinSquareFactory(String stdinSide){
        this.side = Double.parseDouble(stdinSide);
    }

    @Override
    public Square createInstance() {
        return new Square(side);
    }
}

