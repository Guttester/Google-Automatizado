package Tests;

import Core.ElementsGoogle;
import Page.GoogleComponents;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CT11 {

    @Test
    public void CT11_validar_acesso_termos_google() {

        ElementsGoogle temp = new ElementsGoogle(null);
        System.setProperty("webdriver.chrome.driver", temp.dirDriver);

        WebDriver driver = new ChromeDriver();
        ElementsGoogle objElements = new ElementsGoogle(driver);
        GoogleComponents google = new GoogleComponents(driver);

        driver.get(objElements.urlBase);
        google.clicarLinkTermos();

        try { Thread.sleep(4000); } 
        catch (InterruptedException e){ e.printStackTrace(); }

        String urlAtual = driver.getCurrentUrl();
        assertTrue(urlAtual.contains("terms"), "URL não contém 'terms'. Página de Termos pode não ter sido carregada.");

        driver.quit();
    }
}
