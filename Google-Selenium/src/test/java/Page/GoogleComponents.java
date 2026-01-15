package Page;

import Config.BaseSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Core.ElementsGoogle;


public class GoogleComponents extends BaseSelenium {
	private ElementsGoogle objElements;
	
	public GoogleComponents(WebDriver driver) {
        super(driver);
        objElements = new ElementsGoogle(driver);
        PageFactory.initElements(driver, objElements);
    }
	
	public void googleSearch(){
		objElements.inputSearch.click();
		objElements.inputSearch.sendKeys(objElements.textSearch);
	}
	
	public void acessarGoogleImagens() {
	    objElements.btnImageXpath.click();
	}
	
	public void abrirMenuAppsGoogle() {
	    objElements.btnAppGoogle.click();
	}
	
	public void acessarYoutubeViaApps() {
	    objElements.btnAppGoogle.click();
	    
	    try { Thread.sleep(2000); } 
        catch (InterruptedException e){ e.printStackTrace(); }
	    
	    driver.switchTo().frame(0);
	    objElements.btnYoutube.click();
	}
	
	public void acessarDriveViaApps() {
	    objElements.btnAppGoogle.click();
	    
	    try { Thread.sleep(2000); } 
        catch (InterruptedException e){ e.printStackTrace(); }
	    
	    driver.switchTo().frame(0);
	    objElements.btnDrive.click();
	}
	
	public void acessarGmailViaApps() {
	    objElements.btnAppGoogle.click();
	    
	    try { Thread.sleep(2000); } 
        catch (InterruptedException e){ e.printStackTrace(); }
	    
	    driver.switchTo().frame(0);
	    objElements.btnGmail.click();
	}
	
	public void acessarMapsViaApps() {
	    objElements.btnAppGoogle.click();
	    
	    try { Thread.sleep(2000); } 
        catch (InterruptedException e){ e.printStackTrace(); }
	    
	    driver.switchTo().frame(0);
	    objElements.btnMaps.click();
	}
	
	public void clicarBotaoLogin() {
	    objElements.btnLogin.click();
	}
	
	public void tentarLoginComEmailInvalido() {
	    objElements.btnLogin.click();

	    try { Thread.sleep(2000); } 
        catch (InterruptedException e){ e.printStackTrace(); }

	    PageFactory.initElements(driver, objElements);
	    objElements.inputEmail.sendKeys(objElements.emailInvalid);
	    objElements.btnProximo.click();
	}
	
	public void clicarLinkTermos(){
		objElements.btnTermos.click();
	}
	
}
