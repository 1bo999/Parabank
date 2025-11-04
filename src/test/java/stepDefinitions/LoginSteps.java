package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoggedInPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginSteps extends ReusableMethods {

    HomePage hp;
    LoggedInPage lip;

    @Given("Navigate to the Homepage")
    public void navigate_to_the_homepage() {
        hp = new HomePage();
        lip = new LoggedInPage();

        driver.get(ConfigReader.getProperty("url"));
    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        mySendKeys(hp.userNameInput, ConfigReader.getProperty("username"));
        mySendKeys(hp.passwordInput, ConfigReader.getProperty("password"));
    }
    @When("Click login button")
    public void click_login_button() {
        myClick(hp.loginBtn);
    }
    @Then("Verify Home page opened")
    public void verify_home_page_opened() {
        verifyContainsText(lip.welcomeText,"Welcome");
    }
}
