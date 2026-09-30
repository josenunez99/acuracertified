package com.acuracertified.acura.test.basetest;

import com.acuracertified.acura.test.pages.factory.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setup() {
        driver = DriverFactory.createDriver();
        driver.get(
                "https://www.acuracertified.com"
        );
    }

    @After
    public void tearDown() {

        if(driver != null) {

            driver.quit();
        }
    }
}