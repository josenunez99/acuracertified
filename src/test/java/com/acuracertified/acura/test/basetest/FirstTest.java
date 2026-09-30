package com.acuracertified.acura.test.basetest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.assertEquals;

public class FirstTest extends BaseTest{
    private String titulo = "";

    @Test
    public void PageSearch() {
        //Valida existencia del Titulo y lo imprime
        assertEquals("Acura Certified Pre-Owned Vehicles - Shop all Makes & Models",driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        titulo = driver.getTitle();
        System.out.println("RESULTADO DE LA PRUEBA" + "\n");
        System.out.println("El titulo es: " + titulo);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Valida existencia del Modal y indica esta visible en pantalla
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement modalZipCode = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector(".ahm-zipcode__container.js-zipcode-modal-container")));
            System.out.println("ZipCode modal: SI fue encontrado");
        } catch (Exception e) {
            System.out.println("ZipCode modal: "+ "NO fue encontrado");
        }

    }

}