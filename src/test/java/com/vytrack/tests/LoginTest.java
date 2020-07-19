package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    /*
    AC1.Verify that store manager or sales manager should be able to access Vehicle model page and
    able to see all Vehicles model information
     */

    @Test(description = "login")
    public void Login() throws Exception  {

        LoginPage loginPage=new LoginPage();
        DashBoardPage dashBoardPage=new DashBoardPage();
        Actions actions=new Actions(Driver.getDriver());

        loginPage.login();
        Thread.sleep(2000);

        actions.moveToElement(dashBoardPage.fleetMenu).perform();
        Thread.sleep(2000);
        dashBoardPage.VehiclePageLink.click();
        Thread.sleep(2000);

        Assert.assertTrue(dashBoardPage.vehicleTable.isDisplayed());

    }

}
