package com.FigureFactory.FigureFactories.FigureFactories.FigureFactoryInstances;

import com.FigureFactory.FigureFactories.FigureFactories.FigureFactory;
import com.FigureFactory.Figures.Figure;
import com.FigureFactory.singleFigureFactories.SingleFigureFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileFigureFactory extends FigureFactory {
    ArrayList<Figure> createdFigures;

    public FileFigureFactory() {
        createdFigures = super.createdFigures;
    }

//src/test/java/com/FigureFactory/testing.txt
    @Override
    public void createFigures() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        Scanner scanner = new Scanner(new File(sc.nextLine()));

        while(scanner.hasNextLine()) {
            try {
                String figureInput = scanner.nextLine();
                String className = "com.FigureFactory.singleFigureFactories.StdinFactories.Stdin" + figureInput.split(" ")[0] + "Factory";
                Class<?> info = Class.forName(className);
                SingleFigureFactory factory = (SingleFigureFactory) info.getConstructor(String.class).newInstance(figureInput.substring(figureInput.indexOf(" ") + 1));
                createdFigures.add(factory.createInstance());
            } catch (Exception e) {
                System.out.println(e);
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
