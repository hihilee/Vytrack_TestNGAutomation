package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateVehiclesPage extends BasePage {

    @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
    public WebElement fuelType;

}
