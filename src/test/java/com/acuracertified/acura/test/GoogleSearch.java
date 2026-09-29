package com.acuracertified.acura.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GoogleSearch {

        private ChromeDriver driver;

        @Before
         public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.acuracertified.com/");
        }

        @Test
        public void testGooglePage() {
            assertEquals("Acura Certified Pre-Owned Vehicles - Shop all Makes & Models",driver.getTitle());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @After
        public void tearDown() {
            driver.quit();
        }

}