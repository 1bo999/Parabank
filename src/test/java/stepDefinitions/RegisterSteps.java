package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.internal.IConfiguration;
import pages.HomePage;
import pages.LoggedInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
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
import java.beans.Visibility;

public class RegisterSteps extends ReusableMethods {

    RegisterPage rp;

    @Given("The user navigates to the ParaBank website")
    public void the_user_navigates_to_the_para_bank_website() {
        rp = new RegisterPage();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Click the Register link on the home page.")
    public void click_the_link_on_the_home_page() {
        myClick(rp.registerBtn);
    }

    @When("The user fills the areas given in the customer data.")
    public void the_user_fills_the_areas_given_in_the_customer_data() {
        mySendKeys(rp.firstName, ("bill"));
        mySendKeys(rp.lastName, ("gates"));
        mySendKeys(rp.address,("home"));
        mySendKeys(rp.city,("home2"));
        mySendKeys(rp.state,("8472308"));
        mySendKeys(rp.zipCode,("0034"));
        mySendKeys(rp.phone,("75238675840"));
        mySendKeys(rp.ssn, ("3424"));
        mySendKeys(rp.userName, ("username123456"));
        mySendKeys(rp.password, ("1234"));
        mySendKeys(rp.passwordConfirm, ("1234"));
    }

    @When("Click the user register button.")
    public void click_the_user_register_button() {
        myClick(rp.registerBtn2);
    }

    @Then("Click register button")
    public void click_register_button(){
            String actualText = rp.welcomeText.getText();
            Assert.assertTrue(actualText.contains("Welcome"), "Kayıt sonrası karşılama mesajı bulunamadı!");
        }
    }

