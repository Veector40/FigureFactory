package com.FigureFactory.FigureFactories.FigureFactories;

import com.FigureFactory.Figures.Figure;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class FigureFactory {
    protected ArrayList<Figure> createdFigures = new ArrayList<>();
    public FigureFactory(){

    }
    public void createFigures() throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, FileNotFoundException {}

    public Figure getFigure(int index) {
        try {
            return createdFigures.get(index);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
    public ArrayList<Figure> getFigures() {
        return createdFigures;
    }
    public void storeFigures() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Name of the file to write down the figures on: ");
            FileWriter myWriter = new FileWriter(sc.nextLine());
            String toFile = "";
            for(Figure figure: createdFigures) {
                toFile += figure.getString() + "\n";
            }
            myWriter.append(toFile);
            myWriter.close();
            if (createdFigures.size() != 0){
                System.out.println("Successfully wrote to the file.");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public double totalArea() {
        double totalArea = 0;
        for (Figure figure : createdFigures) {
            totalArea += figure.area();
        }
        return totalArea;
    }

    public double totalPerimeter() {
        double totalArea = 0;
        for (Figure createdFigure : createdFigures) {
            totalArea += createdFigure.perimeter();
        }
        return totalArea;
    }

    public void duplicateFigure(int i) {
        createdFigures.add(i, createdFigures.get(i));
    }
    public void deleteFigure(int i) {
        createdFigures.remove(i);
    }
}
