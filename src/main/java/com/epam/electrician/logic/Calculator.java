package com.epam.electrician.logic;

import com.epam.electrician.model.Appliance;
import com.epam.electrician.model.ElectricityGrid;

import java.util.List;

public class Calculator {

    public int calculateTotalPower(ElectricityGrid electricityGrid) {

        List<Appliance> appliances = electricityGrid.getAppliances();

        int totalPower = 0;

        for (Appliance appliance : appliances) {
            int currentPower = appliance.getPower();
            totalPower += currentPower;
        }

        return totalPower;
    }

}