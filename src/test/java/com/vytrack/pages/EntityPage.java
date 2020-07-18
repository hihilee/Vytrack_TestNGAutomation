package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntityPage {
    @FindBy(xpath = "//a[@title='Edit Vehicles Model']")
    public WebElement editButton;

    @FindBy(xpath = "//a[@title='Delete Vehicles Model']")
    public WebElement deleteButton;
}
