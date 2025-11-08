package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TransactionPage;
import utilities.ReusableMethods;

public class TransactionSteps extends ReusableMethods {
    TransactionPage tp;

@Given("Transaction Details")
    public void Transaction_Details(){
verifyContainsText(tp.transactionDetailsText, "Transaction Details");
}
@Then("Verify date of payment")
    public void verifyDateOfPayment() {
    verifyContainsText(tp.paymentDate, "11-06-2025");
    }
    @Then("Verify description of payment")
    public void verifyDescriptionOfPayment() {
    verifyContainsText(tp.paymentDescription, "Bill Payment to Gediz Elektrik");
    }
    @And("Verify amount of payment")
    public void verifyAmountOfPayment() {
    verifyContainsText(tp.paymentAmount, "$80,00");
    }
}
