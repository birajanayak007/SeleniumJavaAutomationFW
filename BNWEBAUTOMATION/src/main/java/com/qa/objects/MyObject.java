package com.qa.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyObject {
    private WebDriver driver;

    public MyObject(WebDriver driver) {
        this.driver = driver;
    }

    // Method to switch to an iframe by name or ID
    public void switchToIframeByNameOrId(String iframeNameOrId) {
        driver.switchTo().frame(iframeNameOrId);
    }

    // Method to switch to an iframe by index
    public void switchToIframeByIndex(int index) {
        driver.switchTo().frame(index);
    }

    // Method to switch to an iframe by WebElement
    public void switchToIframeByWebElement(By iframeLocator) {
        WebElement iframeElement = driver.findElement(iframeLocator);
        driver.switchTo().frame(iframeElement);
    }

    // Method to switch back to the default content (main page)
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    // Example of interacting with an element inside the iframe after switching
    public void enterTextInIframeField(String text) {
        // Assuming there's an input field with id "myInputField" inside the iframe
        driver.findElement(By.id("myInputField")).sendKeys(text);
    }
}