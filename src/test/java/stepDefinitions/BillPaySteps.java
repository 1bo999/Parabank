package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class BillPaySteps extends ReusableMethods {
    OverviewPage op = new OverviewPage();
    BillPayPage bpp = new BillPayPage();
    ActivityPage ap = new ActivityPage();
    TransactionPage tp = new TransactionPage();
    Random random = new Random();
    String accountID;

    @Given("User clicks on Bill Pay button")
    public void user_clicks_on_bill_pay_button() {
        waitForElementsToBeVisible(op.accountNo);
        int randomI = random.nextInt(op.accountNo.size());
        accountID = op.accountNo.get(randomI).getText();

        myClick(op.billPayBtn);
    }

    @When("User enters {string} information")
    public void user_enters_information(String payment) {
        verifyContainsText(bpp.billPaymntServcText, "Bill Payment Service");
        mySendKeys(bpp.payeeNameInput, payment);
        bpp.fillInfo();
    }

    @When("User enters the {string}")
    public void user_enters_the(String amount) {
        mySendKeys(bpp.amountInput, amount);
    }

    @When("Selects the from account")
    public void selects_the_from_account() {
        myClick(bpp.selectFromAccount);

        clickOptionByText(bpp.fromAccountOps, accountID);
    }

    @When("User clicks send payment button")
    public void user_clicks_send_payment_button() {
        myClick(bpp.sendPaymentBtn);
    }

    @Then("Verify payment complete message")
    public void verify_payment_complete_message() {
        verifyContainsText(bpp.completedPaymentMessage, "Bill Payment Complete");
    }

    @Given("User clicks on Accounts Overview button")
    public void user_clicks_on_accounts_overview_button() {
        myClick(bpp.accountsOverviewBtn);
    }

    @When("Verify Overview page opened")
    public void verify_overview_page_opened() {
        verifyContainsText(op.overViewText, "Accounts Overview");
    }

    @Given("User clicks the paid from account")
    public void user_clicks_the_paid_from_account() {
        waitForElementsToBeVisible(op.accountNo);
        clickOptionByText(op.accountNo, accountID);
    }

    @Then("Verify Account Activity page opened")
    public void verify_account_activity_page_opened() {
        verifyContainsText(ap.accountDetailsText, "Account Details");
    }

    @When("User clicks type of {string}")
    public void user_clicks_type_of(String payment) {
        wait.until(ExpectedConditions.visibilityOf(ap.transactionTable));
        clickOptionByText(ap.transactionLink, payment);
    }

    @Then("Verify Transaction Details page opened")
    public void verify_transaction_details_page_opened() {
        verifyContainsText(tp.transactionDetailsText, "Transaction Details");
    }

    @Then("Verify Transaction Details displayed {string}")
    public void verify_transaction_details_displayed(String payment) {
        verifyContainsText(tp.paymentDescription, payment);
    }

    public void clickOptionByText(List<WebElement> optionsList, String targetText) {
        wait.until(ExpectedConditions.visibilityOfAllElements(optionsList));
        for (WebElement element : optionsList) {
            if (element.getText().contains(targetText)) {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                myClick(element);
                break;
            }
        }
    }
}
