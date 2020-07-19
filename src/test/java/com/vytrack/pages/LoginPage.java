package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput" )
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginButton;

    @FindBy(xpath = "custom-checkbox__icon")
    public WebElement rememberMeBox;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotYourPasswordLink;


    public void login(){
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        wait.until(ExpectedConditions.visibilityOf(usernameInput)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(password, Keys.ENTER);
    }

    /*
    Actions actions=new Actions(Driver.getDriver());

    public void moveToHeaderLink(String headerName){
        for(WebElement each: headerList){
            if(each.getText().contains("Fleet")){
                actions.moveToElement(each).perform();
                break;
            }
        }
    }
*/



}


