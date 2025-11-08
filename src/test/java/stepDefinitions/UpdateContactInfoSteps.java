package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OverviewPage;
import pages.UpdateContactInfoPage;
import utilities.ReusableMethods;

public class UpdateContactInfoSteps extends ReusableMethods {

    boolean emptyInput;

    OverviewPage op = new OverviewPage();
    UpdateContactInfoPage upp = new UpdateContactInfoPage();

    @Given("Verify Overview page text")
    public void verify_overview_page_text() {
        verifyContainsText(op.overViewText, "Overview");
    }

    @When("Click Update Contact Info button")
    public void click_update_contact_info_button() {
        myClick(op.updateContactInfoBtn);
    }

    @Given("Verify Update Profile page opened")
    public void verify_update_profile_page_opened() {
        verifyContainsText(upp.updateProfileText, "Update Profile");
    }

    @When("Update first {string} and {string} lastnames")
    public void updateFirstAndLastnames(String firstName, String lastName) {
        if (firstName.isEmpty() || lastName.isEmpty()) {
            emptyInput = true;
        }

        upp.clearSendKeys(upp.name, firstName);
        upp.clearSendKeys(upp.lastName, lastName);
    }

    @And("Update address details {string} {string} {string}")
    public void updateAddressDetails(String address, String city, String state) {
        if (address.isEmpty() || city.isEmpty() || state.isEmpty()) {
            emptyInput = true;
        }
        upp.clearSendKeys(upp.address, address);
        upp.clearSendKeys(upp.city, city);
        upp.clearSendKeys(upp.state, state);
    }

    @Then("Update zipcode {string}")
    public void updateZipcode(String zipcode) {
        if (zipcode.isEmpty()) {
            emptyInput = true;
        }
        upp.clearSendKeys(upp.zipCode, zipcode);
    }

    @Then("Click update profile button")
    public void click_update_profile_button() {
        myClick(upp.updateProfileBtn);
        if (emptyInput) {
            upp.errorChecker();
        }
    }

    @Then("Verify Message displayed")
    public void verifyMessageDisplayed() {
        if (upp.updatedProfileText.isDisplayed()) {
            verifyContainsText(upp.updatedProfileText, "Profile Updated");
        } else if (upp.internalErrorMsg.isDisplayed()) {
            System.out.println("Internal error on the website");
        }
    }
}
