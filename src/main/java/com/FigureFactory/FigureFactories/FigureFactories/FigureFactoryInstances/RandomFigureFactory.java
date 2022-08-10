package com.FigureFactory.FigureFactories.FigureFactories.FigureFactoryInstances;

import com.FigureFactory.FigureFactories.FigureFactories.FigureFactory;
import com.FigureFactory.Figures.Figure;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

import java.util.*;

public class RandomFigureFactory extends FigureFactory {
    ArrayList<Figure> createdFigures;

    public RandomFigureFactory() {
        createdFigures = super.createdFigures;
    }


    @Override
    public void createFigures() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of randomly generated figures: ");
        int numberOfFigures = Integer.parseInt(sc.nextLine());
        Map<Integer, String> randMap = new HashMap<>();
        randMap.put(0, "Square");
        randMap.put(1, "Rectangle");
        randMap.put(2, "Circle");
        randMap.put(3, "Triangle");
        for (int i = 0; i < numberOfFigures; i++) {
            try {
                String className = "com.FigureFactory.singleFigureFactories.RandomFactories.Random" + randMap.get(new Random().nextInt(4)) + "Factory";
                Class<?> info = Class.forName(className);
                SingleFigureFactory factory = (SingleFigureFactory) info.getConstructor().newInstance();
                createdFigures.add(factory.createInstance());
            } catch (Exception e) {
                if(!e.getClass().getCanonicalName().equals("java.lang.IllegalStateException")) {
                    System.out.println(e);
                }
                i--;
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
