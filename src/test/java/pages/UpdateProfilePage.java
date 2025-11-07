package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class UpdateProfilePage extends ReusableMethods {

    public UpdateProfilePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@id='updateProfileForm']/h1")
    public WebElement updateProfileText;

    @FindBy(xpath = "//tbody/tr[1]/td/input")
    public WebElement name;

    @FindBy(xpath = "//tbody/tr[2]/td/input")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement updateProfileBtn;

    @FindBy(xpath = "//h1[text()='Profile Updated']/following-sibling::p")
    public WebElement updateProfileTextResult;

    @FindBy(xpath = "//tbody/tr/td[3]/span")
    public List<WebElement> updateErrors;

    public void errorChecker() {
        for (int i = 0; i < updateErrors.size(); i++) {
            if (updateErrors.get(i).isDisplayed()) {
                verifyContainsText(updateErrors.get(i), expectedErMsg().get(i));
                System.out.println("Error displayed");
            }
        }
    }

    private List<String> expectedErMsg() {
        return List.of(
                "First name",
                "Last name",
                "Address",
                "City",
                "State",
                "Zip Code"
        );
    }
}
