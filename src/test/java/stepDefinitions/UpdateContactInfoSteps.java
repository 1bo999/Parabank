package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.OverviewPage;
import pages.UpdateProfilePage;
import utilities.ReusableMethods;

public class UpdateContactInfoSteps extends ReusableMethods {

    OverviewPage op = new OverviewPage();
    UpdateProfilePage upp = new UpdateProfilePage();

    @Then("Verify Overview page text")
    public void verifyOverviewPageText() {
        verifyContainsText(op.overViewText, "Welcome");
    }

    @Then("Click Update Contact Info button")
    public void click_update_contact_info_button() {
        myClick(op.updateContactInfoBtn);
    }

    @Then("Verify Update Profile page opened")
    public void verifyUpdateProfilePageOpened() {
        verifyContainsText(upp.updateProfileText, "Update Profile");
    }

    @Then("Update {string}")
    public void update_name(String name) {
        mySendKeys(upp.address, name);
    }

    @Then("Update {string}")
    public void update_lastName(String lastName) {
        mySendKeys(upp.address, lastName);
    }

    @Then("Update {string}")
    public void update_address(String adress) {
        mySendKeys(upp.address, adress);
    }

    @Then("Update {string}")
    public void update_city(String city) {
        mySendKeys(upp.city, city);
    }

    @Then("Update {string}")
    public void update_state(String state) {
        mySendKeys(upp.state, state);
    }

    @Then("Update {string}")
    public void update_zip_code(String zipcode) {
        mySendKeys(upp.zipCode, zipcode);
    }

    @Then("Update {string}")
    public void updatePhone(String phone) {
        mySendKeys(upp.phone, phone);
    }

    @Then("Click update profile button")
    public void clickUpdateProfileButton() {
        myClick(upp.updateProfileBtn);
        upp.errorChecker();
    }

    @Then("Verify profile updated text")
    public void verifyProfileUpdatedText() {
        verifyContainsText(upp.updateProfileTextResult, "Your updated");
    }
}
