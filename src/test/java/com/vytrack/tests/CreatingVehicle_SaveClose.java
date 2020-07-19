package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.EntityPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.CreateVehiclesModelPage;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

public class CreatingVehicle_SaveClose extends TestBase {

    /*
    AC2. Verify that Store manager or Sales manager should be able to create new Vehicle model
     */
    @Test(priority = 1,description = "creating new Vehicle Model")

    public void creating_vehicle_model() throws Exception{

        LoginPage loginPage=new LoginPage();
        DashBoardPage dashBoardPage= new DashBoardPage();
        CreateVehiclesModelPage vehiclesModelPage=new CreateVehiclesModelPage();
        Actions actions=new Actions(Driver.getDriver());

        loginPage.login();

        actions.moveToElement(dashBoardPage.fleetMenu).perform();
        Thread.sleep(2000);
        dashBoardPage.VehiclePageLink.click();

        vehiclesModelPage.createVehiclesModelButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(vehiclesModelPage.titleGeneral.isDisplayed());

        vehiclesModelPage.modelInput.sendKeys("Corolla");
        vehiclesModelPage.makeInput.sendKeys("Toyota");

        vehiclesModelPage.canBeRequestedOption.click();
        actions.moveToElement(vehiclesModelPage.yesClick).click().perform();

        vehiclesModelPage.logoUpload.sendKeys("C:\\Users\\hilal\\OneDrive\\Desktop\\toyota_logo.png");
        vehiclesModelPage.catalogValueInput.sendKeys("120000");
        vehiclesModelPage.co2FeeInput.sendKeys("100");
        vehiclesModelPage.costInput.sendKeys("2000");
        vehiclesModelPage.totalCostInput.sendKeys("2100");
        vehiclesModelPage.co2EmissiosInput.sendKeys("25");

        vehiclesModelPage.fuelTypeMenu.click();

        for(WebElement each:vehiclesModelPage.fuelTypeOptions){
            if(each.getText().contains("Gasoline")){
                each.click();
                break;
            }
        }

        vehiclesModelPage.vendorsInput.sendKeys("Toyota");
        actions.moveToElement(vehiclesModelPage.saveAndCloseButton).click().perform();

        Assert.assertTrue(vehiclesModelPage.createdVehicleNumber.isDisplayed());

        Thread.sleep(2000);

    }

     /*
    AC4.Verify that store manager or sales manager should be able to Edit or delete the Vehicle model.
     */

    @Test(priority = 2)
    public void edit_delete_vehicle_model() throws Exception{

        CreateVehiclesModelPage vehiclesModelPage=new CreateVehiclesModelPage();
        Actions actions=new Actions(Driver.getDriver());

        EntityPage entityPage=new EntityPage();

        actions.moveToElement(entityPage.editButton).click().perform();
        Assert.assertTrue(vehiclesModelPage.titleGeneral.isDisplayed());
        Thread.sleep(2000);
        actions.moveToElement(vehiclesModelPage.saveAndCloseButton).click().perform();

        entityPage.deleteButton.click();
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    /*
    AC5.Verify that store manager or sales manager should be able to reset the grid by click on
    Grid setting."
     */

   // @Test(priority = 3)
    public void reset(){
        CreateVehiclesModelPage vehiclesModelPage=new CreateVehiclesModelPage();
        vehiclesModelPage.resetButton.click();
    }

}
