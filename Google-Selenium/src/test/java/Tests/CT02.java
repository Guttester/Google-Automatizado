package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Core.ElementsGoogle;
import Page.GoogleComponents;

public class CT02 {

    @Test
    public void CT02_validar_pesquisa_google() {

        ElementsGoogle objElements = new ElementsGoogle(null);
        System.setProperty( "webdriver.chrome.driver",objElements.dirDriver);
        WebDriver driver = new ChromeDriver();
        GoogleComponents google = new GoogleComponents(driver);

        driver.get(objElements.urlBase);
        google.googleSearch();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
