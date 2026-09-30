package com.acuracertified.acura.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void setZipCode(String zipCode) {

        WebElement txtZipCode = driver.findElement(By.id("zipcode-modal-input"));

        txtZipCode.clear();

        txtZipCode.sendKeys(zipCode);
    }
    public void clickSearchButton() {

        WebElement btnSearch = driver.findElement(By.cssSelector(".js-search"));
        btnSearch.click();
    }
    public void ZipCodeVisibility() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement zipcodeMainpae = driver.findElement(By.cssSelector(".js-zipcode-span"));
    }
    public String getYourLocationZipCode() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement yourLocation = driver.findElement(By.cssSelector(".ahm-inventory-vehicles-cards__location-zipcode"));
        return yourLocation.getText();
    }

}