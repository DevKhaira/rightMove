package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.nonFeaturedClickable;
import modules.searchAction;
import modules.sort;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BlankStepDefs{
    public WebDriver driver;
    
    public BlankStepDefs()
    {
    	driver = Hooks.driver;
    }
    
    @Given("^I open rightmove website$")
    public void i_open_rightmove_website() throws Throwable {
        driver.get("http://www.rightmove.com");
        PageFactory.initElements(driver, this);

    }

    @When("^I search for (.*) with property type (.*)$")
        public void searchForProperty(String place, String propertyType) throws Throwable {
            searchAction.Execute(driver, place, propertyType);
        }

    @And("^I select (.*) in sort$")
        public void sortSearch(String sortBy) throws Throwable {
        sort.Execute(driver, sortBy);
        }

    @Then("^I should be able to click the first non-featured property$")
    public void clickNonFeatured() throws Throwable {
      nonFeaturedClickable.Execute(driver);
      ExpectedConditions.titleContains("for sale");
    }
    
}