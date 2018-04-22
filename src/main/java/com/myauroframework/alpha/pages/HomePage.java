package com.myauroframework.alpha.pages;

import com.myauroframework.alpha.BrowserFectory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class HomePage extends BrowserFectory {
    @FindBy(linkText = "Homepage")
    WebElement homepagelink;

    @FindBy(linkText = "Sign in")
    WebElement signlink;





    public void varifyhomepage() {
        homepagelink.click();
    }

    public void signButton (){
        signlink.click();
    }

    public String  homepagetital(){
       return driver.getTitle();
    }
}



