package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.internal.IConfiguration;
import pages.HomePage;
import pages.LoggedInPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class RegisterSteps extends ReusableMethods {
    HomePage hp;
    LoggedInPage lip;
    RegisterPage rp;

    @Given("Navigate to the Homepage")
    public void navigate_to_the_homepage() {
        hp = new HomePage();
        lip = new LoggedInPage();
        driver.get(ConfigReader.getProperty("url"));
    }
    @When("Click register button")
    public void Click_register_button(){
        myClick(rp.registerBtn);
    }
    @Then("Enter a valid first name last name address city state zip code phone number ssn username password passwordConfirm")
public void Enter_a_valid_first_name_last_name_address_city_state_zip_code_phone_number_ssn_username_password_passwordConfirm(){
        mySendKeys(rp.firstName, ConfigReader.getProperty("firstname"));
        mySendKeys(rp.lastName, ConfigReader.getProperty("lastname"));
        mySendKeys(rp.Address, ConfigReader.getProperty("address"));
        mySendKeys(rp.city,ConfigReader.getProperty("city"));
        mySendKeys(rp.state,ConfigReader.getProperty("state"));
        mySendKeys(rp.zipCode,ConfigReader.getProperty("zipcode"));
        mySendKeys(rp.phone, ConfigReader.getProperty("phoneNr"));
        mySendKeys(rp.ssn,ConfigReader.getProperty("ssn"));
        mySendKeys(rp.userName,ConfigReader.getProperty("username"));
        mySendKeys(rp.password,ConfigReader.getProperty("password"));
        mySendKeys(rp.passwordConfirm,ConfigReader.getProperty("password"));
    }
    @And("Click the Register button")
    public void Click_the_Register_button(){
        myClick(rp.registerBtn2);
    }
    @Then("registration should be successful")
    public void registration_should_be_successful(){
verifyContainsText(lip.welcomeText, "Welcome");
    }






}
