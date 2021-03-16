package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EspocrmLoginPage;
import pages.OpenAccountPage;
import utils.Driver;

public class OpenAccountSteps {

    WebDriver driver;
    EspocrmLoginPage espocrmLoginPage;
    OpenAccountPage openAccountPage;

    @Given("the user navigate the {string}")
    public void the_user_navigate_the(String url) throws InterruptedException {
        driver = Driver.getDriver();
        driver.get(url);
        espocrmLoginPage = new EspocrmLoginPage(driver);
        Thread.sleep(2000);
        espocrmLoginPage.login.click();
    }

    @When("the user open the Accounts")
    public void the_user_open_the_accounts() {
        openAccountPage = new OpenAccountPage(driver);
        openAccountPage.clickAccount.click();
    }

    @Then("the user clicks the Create Account button")
    public void the_user_clicks_the_create_account_button() {
        openAccountPage.CreateAccountButton.click();
    }

    @Then("the user create new account {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string} {string}, {string}, {string}")
    public void the_user_create_new_account(String name, String website, String email, String phone, String country, String postalCode, String state, String city, String street, String type, String industry, String description) {

        openAccountPage.sendNewAccountInfo(name, website, email, phone, country, postalCode, state, city, street, type, industry, description);
        openAccountPage.clickSave.click();

    }

    @Then("the user validate the new users is created {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string} {string}, {string}, {string}")
    public void the_user_validate_the_new_users_is_created(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {



    }


}
