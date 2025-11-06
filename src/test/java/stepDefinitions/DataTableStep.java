package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DataTablePage;
import pages.OverviewPage;
import pages.UpdateProfilePage;
import utilities.ReusableMethods;

import java.util.List;

public class DataTableStep extends ReusableMethods {

    OverviewPage op = new OverviewPage();
    DataTablePage dtp =new DataTablePage();

    @Given("verify page text")
    public void verifyPageText() {
        verifyContainsText(op.overViewText, "Welcome");
    }
    @When("user clicks Update Contact info link")
    public void userClicksUpdateContactInfoLink() {
        myClick(op.updateContactInfoBtn);
    }

    @And("user clears the following fields address {string} city {string} state {string}")
    public void userClearsTheFollowingFieldsAddressCityState(String address, String city, String state) {

    }

    @When("user clicks Update Profile button")
    public void userClicksUpdateProfileButton() {
        myClick(dtp.updateProfileBtn);
    }

    @Then("warning messages should appear for the cleared fields")
    public void warning_messages_should_appear_for_the_cleared_fields() {
        verifyContainsText(dtp.errorMsgAddress, "required");
        verifyContainsText(dtp.errorMsgCity, "required");
        verifyContainsText(dtp.errorMsgState, "required");
    }

}

