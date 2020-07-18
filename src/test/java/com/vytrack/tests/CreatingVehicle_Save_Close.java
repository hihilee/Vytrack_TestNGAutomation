package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.EntityPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesModelPage;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatingVehicle_Save_Close {

    /*
    AC2. Verify that Store manager or Sales manager should be able to create new Vehicle model
     */
    @Test(description = "creating new Vehicle Model")

    public void vehicle_model_page() throws Exception{

        LoginPage loginPage=new LoginPage();
        DashBoardPage dashBoardPage= new DashBoardPage();
        VehiclesModelPage vehiclesModelPage=new VehiclesModelPage();
        Actions actions=new Actions(Driver.getDriver());


        loginPage.login();
        dashBoardPage.fleetMenu.click();



        vehiclesModelPage.createVehicleModelButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(vehiclesModelPage.titleGeneral.isDisplayed());
        vehiclesModelPage.modelInput.sendKeys("Corolla");
        vehiclesModelPage.makeInput.sendKeys("Toyota");
        //vehiclesModelPage.requestClick.click();
        //vehiclesModelPage.yesClick.click();
        vehiclesModelPage.logoUpload.sendKeys("C:\\Users\\hilal\\OneDrive\\Desktop\\toyota_logo.png");
        vehiclesModelPage.catalogValueInput.sendKeys("120000");
        vehiclesModelPage.co2FeeInput.sendKeys("100");
        vehiclesModelPage.costInput.sendKeys("2000");
        vehiclesModelPage.totalCostInput.sendKeys("2100");
        vehiclesModelPage.co2EmissiosInput.sendKeys("25");

        vehiclesModelPage.vendorsInput.sendKeys("Toyota");

        vehiclesModelPage.saveCloseButton.click();

    }


     /*
    AC4.Verify that store manager or sales manager should be able to Edit or delete the Vehicle model.
     */


    @Test(priority = 4)
    public void edit_delete_vehicle_model(){
        EntityPage entityPage=new EntityPage();
        entityPage.editButton.click();
        entityPage.deleteButton.click();
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    /*
    AC5.Verify that store manager or sales manager should be able to reset the grid by click on
    Grid setting."
     */

    @Test(priority = 5)
    public void reset(){
        VehiclesModelPage vehiclesModelPage=new VehiclesModelPage();
        vehiclesModelPage.resetButton.click();
    }

}
