package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.OverviewPage;
import utilities.ReusableMethods;

public class OverviewSteps extends ReusableMethods {
    OverviewPage op;

    @Given("Accounts Overview Table")
    public void Accounts_Overview_Table(){
        verifyContainsText(op.accountTable, "Available Amount");
    }
    @Then("Click Account number")
    public void clickAccountNumber() {
        myClick(op.accountNumber);
    }
}
