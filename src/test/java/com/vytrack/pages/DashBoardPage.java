package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashBoardPage extends BasePage {

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetMenu;

    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement VehiclePageLink;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement vehicleTable;

}
