package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OpenAccountPage {

    public OpenAccountPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[@data-name='Account']")
    public WebElement clickAccount;

    @FindBy(xpath = "//a[@data-name='create']")
    public WebElement CreateAccountButton;

    @FindBy(xpath = "//input[@data-name='name']")
    public WebElement nameField;
    @FindBy(xpath = "//input[@data-name='website']")
    public WebElement websiteField;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailField;
    @FindBy(xpath = "//input[@type='input']")
    public WebElement phoneField;

    @FindBy(xpath = "//input[@data-name='billingAddressCountry']")
    public WebElement countryField;
    @FindBy(xpath = "//input[@data-name='billingAddressPostalCode']")
    public WebElement postalCodeField;
    @FindBy(xpath = "//input[@data-name='billingAddressState']")
    public WebElement stateField;
    @FindBy(xpath = "//input[@data-name='billingAddressCity']")
    public WebElement cityField;
    @FindBy(xpath = "//textarea[@data-name='billingAddressStreet']")
    public WebElement streetField;

    @FindBy(xpath = "//select[@data-name='type']")
    public WebElement typeField;
    @FindBy(xpath = "//select[@data-name='industry']")
    public WebElement industryField;
    @FindBy(xpath = "//textarea[@data-name='description']")
    public WebElement descriptionField;

    @FindBy(xpath = "//button[@data-action='save']")
    public WebElement clickSave;

    public void selectByText(String text){
        BrowserUtils.selectByText(typeField, text);
    }

    public void selectByText2(String text){
        BrowserUtils.selectByText(industryField, text);
    }

    public void sendNewAccountInfo(String name, String website, String email, String phone, String country, String postalCode, String state, String city, String street, String type, String industry, String description){

        nameField.sendKeys(name);
        websiteField.sendKeys(website);
        emailField.sendKeys(email);
        phoneField.sendKeys(phone);

        countryField.sendKeys(country);
        postalCodeField.sendKeys(postalCode);
        stateField.sendKeys(state);
        cityField.sendKeys(city);
        streetField.sendKeys(street);

        selectByText(type);

        selectByText2(industry);

        descriptionField.sendKeys(description);
    }
}
