package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ActivityPage;
import utilities.ReusableMethods;

public class ActivitySteps extends ReusableMethods {
ActivityPage acp;

@Given("Account Details")
    public void Account_Details(){
    verifyContainsText(acp.accountDetails, "Account Details");
}
@Then("Transaction Table")
    public void transactionTable() {
verifyContainsText(acp.transactionTable, "Transaction");
    }
    @Then("Click transaction link")
    public void clickTransactionLink() {
    myClick(acp.transactionLink);
    }
}
