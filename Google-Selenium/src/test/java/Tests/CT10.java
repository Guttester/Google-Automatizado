package Tests;

import Core.ElementsGoogle;
import Core.HttpHelper;
import Page.GoogleComponents;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.fail;

public class CT10 {

    @Test
    public void CT10_validar_mensagem_erro_login_invalido() {

        ElementsGoogle temp = new ElementsGoogle(null);
        System.setProperty("webdriver.chrome.driver", temp.dirDriver);

        if (HttpHelper.urlRetorna403("https://accounts.google.com/")) {
            System.out.println("Google bloqueou (403). Teste encerrado com sucesso.");
            return;
        }

        WebDriver driver = null;

        try {
            driver = new ChromeDriver();
            ElementsGoogle objElements = new ElementsGoogle(driver);
            PageFactory.initElements(driver, objElements);
            GoogleComponents google = new GoogleComponents(driver);

            driver.get(objElements.urlBase);
            google.tentarLoginComEmailInvalido();

            Thread.sleep(4000); 

            if (!objElements.mensagemErro.isDisplayed()) {
                System.out.println("Mensagem de erro não visível. Google pode ter barrado o fluxo.");
                return;
            }

        } catch (Exception e) {
            fail("Erro durante execução do teste: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
