package com.acuracertified.acura.test.AcuraHome;

import com.acuracertified.acura.test.basetest.BaseTest;
import com.acuracertified.acura.test.pages.HomePage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AcuraHomeTest extends BaseTest {

    @Test
    public void verifyHomePage() {

        HomePage homePage =
                new HomePage(driver);

        System.out.println("VALIDACIONES DEL HOMEPAGE");
        System.out.println("----------------------------------------------------------------------------------");
///////////////////////////////////////////////////////////////////////////////////////////////////
        // Valida que titulo se muestre y sea el correcto
        System.out.println(
                "1- Titulo: " + "\n"
                       + "   *RESULTADO CAPTURADO: " + homePage.getPageTitle());
        try {
            assertEquals(
                    "Acura Certified Pre-Owned Vehicles - Shop all Makes & Models",
                    homePage.getPageTitle()
            );

            System.out.println(
                    "   *Titulo validado correctamente");
        }catch(Exception e) {
            System.out.println(
                    "   *Titulo Incorrecto!!!");
        }
 ////////////////////////////////////////////////////////////////////////////////////////////////
        // Validacion de que el Dialogo ZipCode se muestra en el Mainpage
        try {
            assertTrue("true",
                    homePage.isZipCodeDisplayed()
            );
            System.out.println(
                    "2- Dialogo ZipCode visible: " + "\n" + "   *SI esta visible.");
        }catch(Exception e) {
            System.out.println(
                    "2- Dialogo ZipCode visible: " + "\n" + "   *NO esta visible.");
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}