package com.acuracertified.acura.test.AcuraHome;

import com.acuracertified.acura.test.basetest.BaseTest;
import com.acuracertified.acura.test.pages.HomePage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcuraHomeTest extends BaseTest {

    @Test
    public void verifyHomePage() {

        HomePage homePage =
                new HomePage(driver);

        System.out.println(
                "Titulo encontrado: "
                        + homePage.getPageTitle());

        assertEquals(
                "Acura Certified Pre-Owned Vehicles - Shop all Makes & Models",
                homePage.getPageTitle()
        );

        System.out.println(
                "Titulo validado correctamente");
    }
}