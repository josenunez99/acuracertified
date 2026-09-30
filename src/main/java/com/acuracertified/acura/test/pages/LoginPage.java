package com.acuracertified.acura.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By txtUser =
            By.id("jose.nunez@babelgroup.com");

    private final By txtPassword =
            By.id("Stark10*");

    private final By btnLogin =
            By.id("slds-button slds-button_brand slds-button slds-var-p-around_small slds-var-m-bottom_xxx-small slds-align_absolute-center SignInBtn");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {

        driver.findElement(txtUser)
                .sendKeys(username);
    }

    public void enterPassword(String password) {

        driver.findElement(txtPassword)
                .sendKeys(password);
    }

    public void clickLogin() {

        driver.findElement(btnLogin)
                .click();
    }

    public void login(String user, String pass) {

        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}