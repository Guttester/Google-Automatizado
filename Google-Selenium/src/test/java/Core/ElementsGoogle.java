package Core;

import Config.BaseSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ElementsGoogle extends BaseSelenium{
	public ElementsGoogle(WebDriver driver) {
        super(driver);
    }

    public String dirDriver= "src/Resource/chromedriver.exe";
	public String emailInvalid= "email_invalido@gmail.com";
	public String urlBase= "https://www.google.com/";
	public String textSearch= "bstqb.qa";
	
	@FindBy(name = "q")
    public WebElement inputSearch;

    @FindBy(name = "btnK")
    public WebElement btnSearch;

    @FindBy(xpath = "//a[contains(@href, 'imghp')] | //a[text()='Images']")
    public WebElement btnImageXpath;

    @FindBy(css = "a[aria-label='Apps do Google'], #gbwa")
    public WebElement btnAppGoogle;

    @FindBy(css = "a[href*='youtube.com']")
    public WebElement btnYoutube;

    @FindBy(css = "a[href*='drive.google.com']")
    public WebElement btnDrive;

    @FindBy(css = "a[href*='mail.google.com']")
    public WebElement btnGmail;

    @FindBy(css = "a[href*='maps.google']")
    public WebElement btnMaps;

    @FindBy(className = "gb_A")
    public WebElement btnLogin;

    @FindBy(css = "a[href*='policies.google.com/terms']")
    public WebElement btnTermos;
	
    @FindBy(css = "div[data-initq]")
    public WebElement blocoPerguntas;
    
    @FindBy(id = "identifierId")
    public WebElement inputEmail;

    @FindBy(id = "identifierNext")
    public WebElement btnProximo;
    
    @FindBy(xpath = "//*[contains(text(), 'Não foi possível')]")
    public WebElement mensagemErro;

}
