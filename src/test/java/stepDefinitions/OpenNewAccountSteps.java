package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.OpenNewAccountPage;
import pages.OverviewPage;
import utilities.ReusableMethods;

public class OpenNewAccountSteps extends ReusableMethods {

    OpenNewAccountPage onap;
    OverviewPage op;

    @Given("User logged in successfully")
    public void userLoggedInSuccessfully() {
        onap = new OpenNewAccountPage();
        op = new OverviewPage();
    }

    @When("Click Open New Account")
    public void click_open_new_account() {
        myClick(op.openNewAccountBtn);
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
