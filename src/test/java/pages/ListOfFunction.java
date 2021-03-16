package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfFunction {

    public ListOfFunction(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav tabs']/li")
    public WebElement functionNames;

}
