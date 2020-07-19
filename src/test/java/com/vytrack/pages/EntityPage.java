package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntityPage {
    @FindBy(xpath = "(//div[@class='pull-left btn-group icons-holder'])[1]")
    public WebElement editButton;

    //Option2 for edit button
   // @FindBy(xpath = "//a[@title='Edit Vehicles Model']")
    public WebElement editButton2;


    @FindBy(xpath = "(//div[@class='pull-left btn-group icons-holder'])[2]")
    public WebElement deleteButton;
}
