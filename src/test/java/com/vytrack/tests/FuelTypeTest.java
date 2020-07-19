package com.vytrack.tests;


import com.vytrack.pages.*;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuelTypeTest extends TestBase  {

     /*
    AC3.Verify that during the creation, all required field should be displayed and Fuel type drop down should
    displayed as (Gasoline,Diesel,Electric,Hybird)
     */
    @Test(priority = 3)
    public void fuel_type(){

        CreateVehiclesModelPage vehiclesModelPage=new CreateVehiclesModelPage();

        vehiclesModelPage.fuelTypeMenu.click();

        List<String> expected=new ArrayList<>(Arrays.asList("Gasoline","Diesel","Electric","Hybrid"));

        Select select= new Select(Driver.getDriver().findElement(By.xpath("//select[@data-name='field__fuel-type']")));
        List<WebElement> dropdownMenu= select.getOptions();

        List<String> actual=new ArrayList<>();
        for(int i=1;i<dropdownMenu.size();i++){
            actual.add(dropdownMenu.get(i).getText());
        }
        Assert.assertTrue(actual.equals(expected));
    }

}
