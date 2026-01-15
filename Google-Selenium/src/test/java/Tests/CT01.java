package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

import Core.ElementsGoogle;

public class CT01 {

    @Test
    public void CT01_validar_acesso_google() {
        ElementsGoogle objElements = new ElementsGoogle(null);
        System.setProperty("webdriver.chrome.driver", objElements.dirDriver);

        WebDriver driver = new ChromeDriver();
        driver.get(objElements.urlBase);
        assertEquals(objElements.urlBase, driver.getCurrentUrl());

        driver.quit();
    }
}
