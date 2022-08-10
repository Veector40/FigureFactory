package com.FigureFactory.Figures.FigureInstances;

import com.FigureFactory.Figures.Figure;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getString() {
        return "Circle " + radius;
    }
}
