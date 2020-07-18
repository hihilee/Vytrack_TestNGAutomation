package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    @BeforeTest
    public void setUp(){
        String url=ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(url);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

  //  @AfterTest
    public void TearDown(){

        Driver.getDriver().close();

    }

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),5);


}
