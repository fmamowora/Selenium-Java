package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
    @Given("^I navigate to dev.giftrt.com website$")
    public void iNavigateToDevGiftrtComWebsite() throws Throwable {

        System.setProperty("webdriver.gecko.driver", "C://Users/user/IdeaProjects/blueskycitadel/src/test/resources/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        String appUrl = "https://www.giftrete.com";

        driver.get(appUrl);


        //throw new PendingException();

    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() throws Throwable {


        //throw new PendingException();
    }


    @And("^I enter email address$")
    public void iEnterEmailAddress() throws Throwable {


        //throw new PendingException();
    }

    @And("^I enter the password$")
    public void iEnterThePassword() throws Throwable {


        //throw new PendingException();
    }

    @And("^I click on Secure Sign In button$")
    public void iClickOnSecureSignInButton() throws Throwable {


        //throw new PendingException();
    }

    @Then("^I should be logged on$")
    public void iShouldBeLoggedOn() throws Throwable {


        //throw new PendingException();
    }

    @And("^I enter invalid email address$")
    public void iEnterInvalidEmailAddress() throws Throwable {


        //throw new PendingException();
    }

    @Then("^I should not be logged on$")
    public void iShouldNotBeLoggedOn() throws Throwable {


        //throw new PendingException();
    }

    @And("^I enter the invalid password$")
    public void iEnterTheInvalidPassword() throws Throwable {


        //throw new PendingException();
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String username) throws Throwable {

        //throw new PendingException();
    }

    @And("^I enter the password \"([^\"]*)\"$")
    public void iEnterThePassword(String password) throws Throwable {


        //throw new PendingException();
    }

    @And("^I enter the invalid password \"([^\"]*)\"$")
    public void iEnterTheInvalidPassword(String arg0) throws Throwable {


        //throw new PendingException();
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String arg0) throws Throwable {


        //throw new PendingException();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String arg0) throws Throwable {


        //throw new PendingException();
    }

    @And("^I log out$")
    public void iLogOut() throws Throwable {


        //throw new PendingException();
    }

}