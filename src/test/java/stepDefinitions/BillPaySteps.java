package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.BillPayPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class BillPaySteps extends ReusableMethods {
    RegisterPage rp;
    BillPayPage bpp;

    @When("Click billPay button")
    public void Click_billPay_button() {
        myClick(rp.registerBtn);
    }

    @Then("Enter payee name")
    public void Enter_payee_name() {
        mySendKeys(bpp.payeeNameInput, ConfigReader.getProperty("payeeName1"));
    }

    @Then("Enter address")
    public void enter_Address() {
        mySendKeys(bpp.addressInput, ConfigReader.getProperty("address"));
    }

    @Then("Enter city")
    public void enter_City() {
        mySendKeys(bpp.cityInput, ConfigReader.getProperty("city"));
    }

    @Then("Enter state")
    public void enter_State() {
        mySendKeys(bpp.stateInput, ConfigReader.getProperty("state"));
    }

    @Then("Enter zipcode")
    public void enter_Zipcode() {
        mySendKeys(bpp.zipCodeInput, ConfigReader.getProperty("zipcode"));
    }

    @Then("Enter phone")
    public void enter_Phone() {
        mySendKeys(bpp.phoneInput, ConfigReader.getProperty("phoneNr"));
    }

    @Then("Enter account")
    public void enter_Account() {
        mySendKeys(bpp.accountInput, ConfigReader.getProperty("accountNr"));
    }

    @Then("Enter verify account")
    public void enter_VerifyAccount() {
        mySendKeys(bpp.verifyAccountInput, ConfigReader.getProperty("accountNr"));
    }

    @Then("Enter amount")
    public void enter_Amount() {
        mySendKeys(bpp.amountInput, String.valueOf(ConfigReader.getIntProperty("amount1")));
    }

    @And("Select from account number")
    public void select_From_AccountNumber() {
        Select select = new Select(bpp.selectFromAccount);
        select.getFirstSelectedOption();
    }

    @Then("Click send payment")
    public void click_Send_Payment() {
        myClick(bpp.sendPaymentBtn);
    }

    @Then("Display completedPaymentMessage")
    public void display_CompletedPaymentMessage() {
        verifyContainsText(bpp.completedPaymentMessage, "Bill Payment Complete");
    }

    @Then("Click Accounts Overview button")
    public void clickAccountsOverviewButton() {
        myClick(bpp.accountsOverviewBtn);
    }

}
