package Tests;

import Core.ElementsGoogle;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CT12 {

    @Test
    public void CT12_validar_clique_primeiro_bloco_pessoas_tambem_perguntam() {

        // Caminho do driver
        ElementsGoogle temp = new ElementsGoogle(null);
        System.setProperty("webdriver.chrome.driver", temp.dirDriver);

        WebDriver driver = null;

        try {
            driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            ElementsGoogle obj = new ElementsGoogle(driver);
            PageFactory.initElements(driver, obj);

            // Abre Google
            driver.get(obj.urlBase);

            // Pesquisa
            wait.until(ExpectedConditions.visibilityOf(obj.inputSearch));
            obj.inputSearch.sendKeys(obj.textSearch);
            obj.inputSearch.sendKeys(Keys.ENTER);

            // Aguarda o bloco "As pessoas também perguntam"
            wait.until(ExpectedConditions.visibilityOf(obj.blocoPerguntas));

            // Pega o PRIMEIRO botão de pergunta dentro do bloco
            WebElement primeiraPergunta = obj.blocoPerguntas
                    .findElement(By.cssSelector("div[role='button']"));

            // Clica
            primeiraPergunta.click();

            // Valida que expandiu (aria-expanded=true)
            String expanded = primeiraPergunta.getAttribute("aria-expanded");
            assertTrue("true".equals(expanded), "Pergunta NÃO expandiu após o clique.");

        } catch (Exception e) {
            throw new RuntimeException("Falha no CT.12: " + e.getMessage(), e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
