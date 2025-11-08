package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountDetailsPage;
import pages.OverviewPage;
import pages.RequestLoanPage;
import utilities.ReusableMethods;

public class RequestLoanSteps extends ReusableMethods {
    RequestLoanPage rlp = new RequestLoanPage();
    OverviewPage op = new OverviewPage();
    AccountDetailsPage adp = new AccountDetailsPage();

    @When("Click request loan option")
    public void clickRequestLoanOption() {
        myClick(op.requestLoan);
    }

    @When("Enter loan amount {string} and down payment {string}")
    public void enterLoanAmountAmountAndDownPaymentDownPayment(String amount, String downPayment) {
        mySendKeys(rlp.loanAmountInput, amount);
        mySendKeys(rlp.downPaymentInput, downPayment);
    }

    @When("Click apply now button")
    public void clickApplyNowButton() {
        myClick(rlp.applyNowBtn);
    }

    @Then("Verify success message")
    public void verifySuccessMessage() {
        verifyContainsText(rlp.approvedText, "approved");
    }

    @When("Click loan account number")
    public void clickLoanAccountNumber() {
        myClick(rlp.newAccountLink);
    }

    @Then("Verify account information")
    public void verifyAccountInfo() {
        verifyContainsText(adp.accountNumber, "Number");
        verifyContainsText(adp.accountType, "LOAN");
        verifyContainsText(adp.balance, "2000");
        verifyContainsText(adp.availableBalance, "2000");
        verifyContainsText(adp.activityInfo, "No transactions found.");
    }
}
