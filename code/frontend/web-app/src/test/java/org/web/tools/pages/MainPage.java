package org.web.tools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    //Today is a new day



    @FindBy(xpath = "//img[@alt='Driver App logo']") //TODO
    public WebElement driverTab ;

    @FindBy() //TODO
    public WebElement uberTab;


}
