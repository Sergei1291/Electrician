package com.epam.electrician.model;

public class Appliance {

    private final ApplianceName name;
    private final int power;

    public Appliance(ApplianceName name, int power) {
        this.name = name;
        this.power = power;
    }

    public ApplianceName getName() {

        return name;
    }

    public int getPower() {

        return power;
    }

}