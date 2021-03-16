package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EspocrmLoginPage;
import pages.ListOfFunction;
import utils.Driver;

import java.util.List;

public class EspoCRMSteps {

    WebDriver driver;
    EspocrmLoginPage espocrmLoginPage;
    ListOfFunction listOfFunction;

    @Given("the user navigate the https {string}")
    public void the_user_navigate_the_https(String url) {
        driver = Driver.getDriver();
        driver.get(url);
    }

    @When("the user opens the home page")
    public void the_user_opens_the_home_page() {
        espocrmLoginPage = new EspocrmLoginPage(driver);
        espocrmLoginPage.login.click();
    }

    @Then("the user should see the function names")
    public void the_user_should_see_the_function_names(DataTable dataTable) {
        listOfFunction = new ListOfFunction(driver);
        String e = listOfFunction.functionNames.getText();
        List<String> names = dataTable.asList();
        for (String function: names){
            System.out.println(function);
            System.out.println(function.length());
        }
    }
}
