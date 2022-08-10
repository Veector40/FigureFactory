package com.FigureFactory;

import com.FigureFactory.Figures.Figure;
import com.FigureFactory.FigureFactories.FactoryCreator;
import com.FigureFactory.FigureFactories.FigureFactories.FigureFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input type: ");
        String inputType = sc.nextLine();
        FigureFactory factory = FactoryCreator.createFactory(inputType.substring(0, 1).toUpperCase() + inputType.substring(1).toLowerCase());

        // Create the generated figures
        factory.createFigures();

        // Get specific figure by index
        int i = 3;
        Figure figure = factory.getFigure(i);

        // Duplicate specific figure by index
        int j = 3;
        factory.duplicateFigure(j);

        // Delete specific figure by index
        int k = 3;
        factory.deleteFigure(k);

        // Get the generated figures
        ArrayList<Figure> figures = factory.getFigures();

        // Get total area of the figures
        double totalArea = factory.totalArea();

        // Get total area of the figures
        double totalPerimeter = factory.totalPerimeter();

        // Write the figures to the figureStorage.txt file
        factory.storeFigures();
    }
}