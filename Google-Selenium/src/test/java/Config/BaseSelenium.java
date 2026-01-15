package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class BaseSelenium {
    protected WebDriver driver;
    
    protected BaseSelenium(WebDriver DRIVER){
    	this.driver= DRIVER;
    	PageFactory.initElements(DRIVER,this);
    }
}
