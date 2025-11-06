package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class UpdateProfilePage extends ReusableMethods {

    public UpdateProfilePage(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy (xpath = "//div[@id='updateProfileForm']/h1")
    public WebElement updateProfileText;

    @FindBy(id="customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id="customer.address.state")
    public WebElement state;

    @FindBy(id="customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id="customer.phoneNumber")
    public WebElement phone;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement updateProfileBtn;

    @FindBy(xpath = "//h1[text()='Profile Updated']/following-sibling::p")
    public WebElement updateProfileTextResult;

}
