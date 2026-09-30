package com.acuracertified.acura.test.login;

import com.acuracertified.acura.test.basetest.BaseTest;
import com.acuracertified.acura.test.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;

public class ZipcodeSearch extends BaseTest {

    private String ZIPCODE = "90210";

    @Test
    public void searchZipcode() {

        HomePage homePage =
                new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("ZIPCODE SEARCH TEST");
        System.out.println("----------------------------------------------------------------------------------");
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //Insertar texto utilizando el metodo
        homePage.isZipCodeDisplayed();
        homePage.setZipCode(ZIPCODE);
        homePage.clickSearchButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.ZipCodeVisibility();
        //Validar que se busco por el zipcode correcto
        String location = homePage.getYourLocationZipCode();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ///Validar porque no muestra el Zipcode en el mensaje de SALIDA
        System.out.print("Your location: " + location);

    }

}
