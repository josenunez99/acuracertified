package com.acuracertified.acura.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public String getPageTitle() {

        return getTitle();
    }

    public boolean isZipCodeDisplayed() {
        try {

            WebElement modalZipCode = driver.findElement(
                    By.cssSelector(".ahm-zipcode__container.js-zipcode-modal-container"));

            return modalZipCode.isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

}