package com.epam.electrician;

import com.epam.electrician.data.FakeElectricityGridCreator;
import com.epam.electrician.logic.Calculator;
import com.epam.electrician.model.ElectricityGrid;
import com.epam.electrician.view.FilePrinter;
import com.epam.electrician.view.Printer;
import com.epam.electrician.view.ViewException;

public class Main {

    private final static String FILE_NAME_RESULT_OUTPUT = "output.txt";

    public static void main(String[] args) throws ViewException {

        //create Electricity Grid
        FakeElectricityGridCreator electricityGridCreator = new FakeElectricityGridCreator();
        ElectricityGrid electricityGrid = electricityGridCreator.create();

        //calculate total power of appliance's
        Calculator calculator = new Calculator();
        int totalPower = calculator.calculateTotalPower(electricityGrid);

        //print result
        Printer printer = new FilePrinter(FILE_NAME_RESULT_OUTPUT);
        printer.print(totalPower);

    }

}