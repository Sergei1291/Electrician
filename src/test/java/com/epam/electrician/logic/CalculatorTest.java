package com.epam.electrician.logic;

import com.epam.electrician.model.Appliance;
import com.epam.electrician.model.ApplianceName;
import com.epam.electrician.model.ElectricityGrid;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testCalculateTotalPowerShouldCalculate() {
        //given
        ElectricityGrid electricityGrid = new ElectricityGrid();
        Appliance appliance1 = new Appliance(ApplianceName.VACUUM_CLEANER, 500);
        Appliance appliance2 = new Appliance(ApplianceName.FRIDGE, 1000);
        electricityGrid.add(appliance1);
        electricityGrid.add(appliance2);
        //when
        int actual = calculator.calculateTotalPower(electricityGrid);
        //then
        Assert.assertEquals(1500, actual);
    }

    @Test(expected = NullPointerException.class) //then
    public void testCalculateTotalPowerShouldTrowNullPointerException() {
        //given
        ElectricityGrid electricityGrid = new ElectricityGrid();
        Appliance appliance1 = new Appliance(ApplianceName.VACUUM_CLEANER, 500);
        Appliance appliance2 = null;
        electricityGrid.add(appliance1);
        electricityGrid.add(appliance2);
        //when
        int actual = calculator.calculateTotalPower(electricityGrid);
    }

}