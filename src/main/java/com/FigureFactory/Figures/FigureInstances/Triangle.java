package com.FigureFactory.Figures.FigureInstances;

import com.FigureFactory.Figures.Figure;

public class Triangle  implements Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if(sideA + sideB <= sideC ||
                sideA + sideC <= sideB ||
                sideB + sideC <= sideA) {
            throw new IllegalStateException("Triangle with sides " + sideA + " " + sideB + " " + sideC + " does not exist.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area()
    {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getString() {
        return "Triangle " + sideA + " " + sideB + " " + sideC;
    }
}

