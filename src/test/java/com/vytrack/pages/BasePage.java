package com.vytrack.pages;

import com.sun.org.glassfish.gmbal.DescriptorFields;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    protected WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//a[@class='oro-dropdown-toggle']")
    public WebElement menuDropDown;

    @FindBy(xpath = "//a[@class='oro-dropdown-toggle email-notification-icon']']")
    public WebElement emailNotificationIcon;

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement faqCircle;

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> headerList;






}
