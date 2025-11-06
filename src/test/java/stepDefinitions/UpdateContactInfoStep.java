package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.OverviewPage;
import pages.UpdateProfilePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class UpdateContactInfoStep extends ReusableMethods {

    OverviewPage op = new OverviewPage();
    UpdateProfilePage upp = new UpdateProfilePage();

    @Then("Verify Overview page text")
    public void verifyOverviewPageText() {
        verifyContainsText(op.overViewText, "Welcome");
    }

    @Then("Update Contact Info button")
    public void update_contact_ınfo_button() {
        myClick(op.updateContactInfoBtn);
    }

    @Then("Verify Update Profile page opened")
    public void verifyUpdateProfilePageOpened() {
        verifyContainsText(upp.updateProfileText, "Update Profile");
        threadWait(2);
    }

    @Then("Update Address")
    public void update_address() {
        mySendKeys(upp.address, ConfigReader.getProperty("addressupdate"));
    }

    @Then("Update City")
    public void update_city() {

        mySendKeys(upp.city, ConfigReader.getProperty("cityupdate"));
    }

    @Then("Update State")
    public void update_state() {

        mySendKeys(upp.state, ConfigReader.getProperty("stateupdate"));
    }

    @Then("Update ZipCode")
    public void update_zip_code() {

        mySendKeys(upp.zipCode, ConfigReader.getProperty("zipcodeupdate"));
    }

    @Then("Update Phone")
    public void updatePhone() {
        mySendKeys(upp.phone, ConfigReader.getProperty("phoneupdate"));
    }


    @Then("Click update profile button")
    public void clickUpdateProfileButton() {
        myClick(upp.updateProfileBtn);
    }

    @Then("Verify profile updated text")
    public void verifyProfileUpdatedText() {
        verifyContainsText(upp.updateProfileTextResult, "Your updated");
    }


}
