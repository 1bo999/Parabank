package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

public class DataTablePage extends ReusableMethods {

    @FindBy(xpath = "//div[@id='updateProfileForm']/h1")
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

    @FindBy(xpath = "(//table[@class='form2']/tbody/tr/td/span)[3]")
    public WebElement errorMsgAddress;

    @FindBy(xpath = "(//table[@class='form2']/tbody/tr/td/span)[4]")
    public WebElement errorMsgCity;
    @FindBy(xpath = "(//table[@class='form2']/tbody/tr/td/span)[5]")
    public WebElement errorMsgState;

}
