package com.epam.electrician.data;

import com.epam.electrician.model.Appliance;
import com.epam.electrician.model.ApplianceName;
import com.epam.electrician.model.ElectricityGrid;

public class FakeElectricityGridCreator {

    public ElectricityGrid create() {

        Appliance tv = new Appliance(ApplianceName.TV, 300);
        Appliance fridge = new Appliance(ApplianceName.FRIDGE, 600);
        Appliance laptop = new Appliance(ApplianceName.LAPTOP, 500);
        Appliance washingMachine = new Appliance(ApplianceName.WASHING_MACHINE, 900);
        Appliance vacuum_cleaner = new Appliance(ApplianceName.VACUUM_CLEANER, 1900);

        ElectricityGrid electricityGrid = new ElectricityGrid();
        electricityGrid.add(tv);
        electricityGrid.add(laptop);
        electricityGrid.add(washingMachine);
        electricityGrid.add(fridge);
        electricityGrid.add(vacuum_cleaner);

        return electricityGrid;
    }

}