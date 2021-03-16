package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EspocrmLoginPage {

    public EspocrmLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btn-login")
    public WebElement login;

}
