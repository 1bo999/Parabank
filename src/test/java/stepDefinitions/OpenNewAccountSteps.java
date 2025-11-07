package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.LoggedInPage;
import pages.OpenNewAccountPage;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class OpenNewAccountSteps extends ReusableMethods {

    LoggedInPage lip;
    OpenNewAccountPage onap;

    @Given("User logged in successfully")
    public void userLoggedInSuccessfully() {
        lip = new LoggedInPage();
        onap = new OpenNewAccountPage();
    }

    @When("Click Open New Account")
    public void click_open_new_account() {
        myClick(lip.openNewAccountBtn);
    }

    @Then("Verify Open New Account text displayed")
    public void verify_open_new_account_text_displayed() {
        verifyContainsText(onap.openNewAccountText, "Open New Account");
    }

    @Then("Select type of account")
    public void select_type_of_account() {
        Select selectType = new Select(onap.typeOfAccount);
        selectType.selectByIndex(0);
    }

    @Then("Select account")
    public void select_account() {
        myClick(onap.whichAccount);
    }

    @When("Click Open New Account button")
    public void click_open_new_account_button() {
        myClick(onap.openNewAccountBtn);
    }

    @Then("Verify successful message")
    public void verify_successful_message() {
        verifyContainsText(onap.newAccountText, "new account");
    }
}
