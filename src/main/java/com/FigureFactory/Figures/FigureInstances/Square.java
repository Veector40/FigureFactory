package com.FigureFactory.Figures.FigureInstances;


import com.FigureFactory.Figures.Figure;

public class Square implements Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String getString() {
        return "Square " + side;
    }
}

