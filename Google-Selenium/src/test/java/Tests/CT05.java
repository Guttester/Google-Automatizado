package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Core.ElementsGoogle;
import Page.GoogleComponents;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CT05 {

    @Test
    public void CT05_validar_acesso_youtube() {

        ElementsGoogle objElements = new ElementsGoogle(null);
        System.setProperty("webdriver.chrome.driver", objElements.dirDriver);

        WebDriver driver = new ChromeDriver();
        GoogleComponents google = new GoogleComponents(driver);

        driver.get(objElements.urlBase);
        google.acessarYoutubeViaApps();

        try { Thread.sleep(4000); } 
        catch (InterruptedException e){ e.printStackTrace(); }

        String urlAtual = driver.getCurrentUrl();
        assertTrue(urlAtual.contains("youtube.com"));

        driver.quit();
    }
}