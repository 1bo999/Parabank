package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ReusableMethods;

public class RegisterSteps extends ReusableMethods {

    HomePage hp = new HomePage();
    RegisterPage rp = new RegisterPage();

    Faker faker = new Faker();

    @When("Click register button")
    public void click_register_button() {
        myClick(hp.registerBtn);
    }

    @Then("Enter a valid credentials")
    public void enterAValidCredentials() {
        rp.fillCredentials();
    }

    @Then("Enter username")
    public void enterUsername() {
        mySendKeys(rp.userName, faker.internet().username());
    }

    @And("Enter password")
    public void enterPassword() {
        String password = faker.internet().password();

        mySendKeys(rp.password, password);
        mySendKeys(rp.passwordConfirm, password);
    }

    @Then("Click the Register button")
    public void click_the_register_button() {
        myClick(rp.registerBtn2);
    }

    @Then("Verify successful registration")
    public void verifySuccessfulRegistration() {
        verifyContainsText(rp.welcomeText,"Welcome");
    }
}
