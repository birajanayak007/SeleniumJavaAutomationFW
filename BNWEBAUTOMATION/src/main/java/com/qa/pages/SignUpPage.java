package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()='Click me']") private WebElement clickMeBtn;
    @FindBy(xpath = "//div[@role='textbox']") private WebElement searchInputTxt;
    public SignUpPage clickClickMe(){
        wait.until(ExpectedConditions.elementToBeClickable(clickMeBtn)).click();
        return this;
    }
    public String getSearchBox(){
        return wait.until(ExpectedConditions.visibilityOf(searchInputTxt)).getText();
    }



}
