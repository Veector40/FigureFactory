package com.FigureFactory.Figures.FigureInstances;

import com.FigureFactory.Figures.Figure;

public class Rectangle implements Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public String getString() {
        return "Rectangle " + sideA + " " + sideB;
    }

}
