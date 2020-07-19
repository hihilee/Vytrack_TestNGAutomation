package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class CreateVehiclesModelPage extends BasePage {

    @FindBy(linkText = "Create Vehicles Model")
    public WebElement createVehiclesModelButton;

    @FindBy(xpath = "//a[.='General']")
    public WebElement titleGeneral;

   // @FindBy(xpath = "(//button[@type='submit'])[1]")
   // public WebElement saveAndCloseButton;

    @FindBy(xpath = "(//i[@class='fa-refresh'])[2]")
    public WebElement resetButton;

    @FindBy(xpath = "//input[contains(@id, 'ModelName')]")
    public WebElement modelInput;

    @FindBy(xpath = "//input[contains(@id, 'Make')]")
    public WebElement makeInput;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
    public WebElement canBeRequestedOption;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public List<WebElement> yesNoOptions;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement yesClick;

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_Logo_file')]")
    public WebElement logoUpload;

    //"C:\Users\hilal\OneDrive\Desktop\toyota_logo.png"

    @FindBy(xpath = "//input[contains(@id,'CatalogValue')]")
    public WebElement catalogValueInput;

    @FindBy(xpath = "//input[contains(@id,'CO2Fee')]")
    public WebElement co2FeeInput;

    @FindBy(xpath = "//input[contains(@id,'Cost')]")
    public WebElement costInput;

    @FindBy(xpath = "//input[contains(@id,'TotalCost')]")
    public WebElement totalCostInput;

    @FindBy(xpath = "//input[contains(@id,'CO2Emissions')]")
    public WebElement co2EmissiosInput;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
    public WebElement fuelTypeMenu;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public List<WebElement> fuelTypeOptions;

    @FindBy(xpath = "//input[contains(@id,'Vendors')]")
    public WebElement vendorsInput;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement createdVehicleNumber;

    //BAKALIM,SORALIM
   // @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement entitySavedMessage;


}
