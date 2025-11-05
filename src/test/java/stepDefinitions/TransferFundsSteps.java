package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountOverviewPage;
import pages.LoggedInPage;
import pages.TransferCompletePage;
import pages.TransferFundsPage;
import utilities.ReusableMethods;

public class TransferFundsSteps extends ReusableMethods {

    LoggedInPage lip = new LoggedInPage();
    TransferFundsPage tfp = new TransferFundsPage();
    TransferCompletePage tcp = new TransferCompletePage();
    AccountOverviewPage aop = new AccountOverviewPage();

    @Given("Click Transfer Funds")
    public void click_transfer_funds() {
        myClick(lip.TransferFunds);
    }

    @When("Verify the Transfer Funds Page")
    public void verify_the_transfer_funds_page() {
        verifyContainsText(tfp.verifyTransferFundsPageText, "Transfer");
    }

    @When("Click Amount Box")
    public void click_amount_box() {
        myClick(tfp.textAmount);
    }

    @Then("Text the amount of the money")
    public void text_the_amount_of_the_money() {
        tfp.enterRandomAmount();
    }

    @Then("Select same account for sender and receiver")
    public void selectSameAccountForSenderAndReceiver() {
        tfp.selectSameAccountForTransfer();
    }

    @Then("Click Transfer Button")
    public void click_transfer_button() {
        myClick(tfp.transferBtn);
    }

    @Then("Verify the Transfer Complete Page")
    public void verify_the_transfer_complete_page() {
        verifyContainsText(tcp.transferCompleteMessage, "Complete");
    }

    @Then("Verify the info")
    public void verify_the_info() {
        verifyContainsText(tcp.verifyTransactionsDetails, "transferred");
    }

    @Then("Click Account Overview Section")
    public void click_account_overview_section() {
        myClick(tcp.clickAccountOverview);
    }

    @Then("Verify the Account Overview Page")
    public void verify_the_account_overview_page() {
        verifyContainsText(aop.verifyAccountOverviewText, "Overview");
    }
}
