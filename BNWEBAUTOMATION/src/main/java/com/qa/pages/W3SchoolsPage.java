package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class W3SchoolsPage extends BasePage {



    @FindBy(id = "iframeResult")
    private WebElement w3SchoolsFrame;
     public void clickIframe()
     {
         driver.switchTo().frame(w3SchoolsFrame);
     }
    @FindBy(id = "search2") private WebElement searchTitle;

    public W3SchoolsPage(WebDriver driver) {
        super(driver);
    }


    public W3SchoolsPage load(){
        load("/default.asp");
        return this;
    }
    public String getSearchTitle(){
        return wait.until(ExpectedConditions.visibilityOf(searchTitle)).getText();
    }


}



