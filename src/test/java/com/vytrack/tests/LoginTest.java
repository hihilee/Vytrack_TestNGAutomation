package com.vytrack.tests;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    /*
    AC1.Verify that store manager or sales manager should be able to access Vehicle model page and
    able to see all Vehicles model information
     */

    @Test(description = "login")
    public void Login()  {

        LoginPage loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();


        DashBoardPage dashBoardPage= new DashBoardPage();
        dashBoardPage.fleetMenu.click();
        wait.until(ExpectedConditions.visibilityOf(dashBoardPage.fleetMenu));
        dashBoardPage.VehiclePageLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(dashBoardPage.VehiclePageLink));


        Assert.assertTrue(dashBoardPage.vehicleTable.isDisplayed());
    }

}
