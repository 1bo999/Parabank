package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class UpdateContactInfoPage extends ReusableMethods {

    public UpdateContactInfoPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[1]/h1")
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

    @FindBy(xpath = "//*[@id='updateProfileResult']/h1")
    public WebElement updatedProfileText;

    @FindBy(xpath = "//tbody/tr/td[3]/span")
    public List<WebElement> updateErrors;

    @FindBy(xpath = "//*[@id='updateProfileError']/p")
    public WebElement internalErrorMsg;

    public void clearSendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();

        if (!text.isEmpty()) {
            element.sendKeys(text);
        } else {
            threadWait(1);
            element.clear();
        }
    }

    public void errorChecker() {
        for (int i = 0; i < updateErrors.size(); i++) {
            if (updateErrors.get(i).isDisplayed()) {
                verifyContainsText(updateErrors.get(i), expectedErMsg().get(i));
                System.out.println("Error message displayed");
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
