package com.FigureFactory.FigureFactories.FigureFactories.FigureFactoryInstances;

import com.FigureFactory.FigureFactories.FigureFactories.FigureFactory;
import com.FigureFactory.Figures.Figure;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class StdinFigureFactory extends FigureFactory {
    ArrayList<Figure> createdFigures;
    public StdinFigureFactory() {
        createdFigures = super.createdFigures;
    }

    @Override
    public void createFigures() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of figures: ");
        int numberOfFigures = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the elements of the array (each on separate line): ");

        for (int i = 0; i < numberOfFigures; i++) {
            try {
                String figureInput = sc.nextLine();
                String typeFigure = figureInput.split(" ")[0];
                String className = "com.FigureFactory.singleFigureFactories.StdinFactories.Stdin" + typeFigure + "Factory";
                Class<?> info = Class.forName(className);
                if (SingleFigureFactory.class.isAssignableFrom(info)) {
                    SingleFigureFactory factory = (SingleFigureFactory) info
                            .getConstructor(String.class)
                            .newInstance(figureInput.substring(figureInput.indexOf(" ") + 1));
                    createdFigures.add(factory.createInstance());
                }
            } catch (Exception e) {
                System.out.println(e);
                --i;
            }
        }
    }

    @Override
    public Figure getFigure(int index) {
        return super.getFigure(index);
    }
    @Override
    public ArrayList<Figure> getFigures() {
        return super.getFigures();
    }
    @Override
    public void storeFigures() {
        super.storeFigures();
    }
    @Override
    public double totalArea() {
        return super.totalArea();
    }

    @Override
    public double totalPerimeter() {
        return super.totalPerimeter();
    }

    @Override
    public void duplicateFigure(int i) {
        super.duplicateFigure(i);
    }
    @Override
    public void deleteFigure(int i) {
        super.deleteFigure(i);
    }
}
