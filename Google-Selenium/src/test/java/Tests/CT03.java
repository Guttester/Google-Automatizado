package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Core.ElementsGoogle;
import Page.GoogleComponents;

public class CT03 {

    @Test
    public void CT03_validar_pesquisa_google_imagens() {

        ElementsGoogle objElements = new ElementsGoogle(null);
        System.setProperty("webdriver.chrome.driver", objElements.dirDriver);
        WebDriver driver = new ChromeDriver();
        GoogleComponents google = new GoogleComponents(driver);

        driver.get(objElements.urlBase);
        google.acessarGoogleImagens();
        google.googleSearch();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
