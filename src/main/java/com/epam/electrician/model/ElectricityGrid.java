package com.epam.electrician.model;

import java.util.ArrayList;
import java.util.List;

public class ElectricityGrid {

    private List<Appliance> appliances;

    public ElectricityGrid() {

        appliances = new ArrayList<Appliance>();
    }

    public void add(Appliance appliance) {

        appliances.add(appliance);
    }

    public List<Appliance> getAppliances() {

        return appliances;
    }

}