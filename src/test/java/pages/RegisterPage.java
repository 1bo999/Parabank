package pages;

import net.datafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class RegisterPage extends ReusableMethods {
    public RegisterPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerBtn2;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement welcomeTextUser;

    public void fillCredentials() {
        Faker faker = new Faker();

        mySendKeys(firstName,faker.name().firstName());
        mySendKeys(lastName,faker.name().lastName());
        mySendKeys(address,faker.address().streetAddress());
        mySendKeys(city,faker.address().city());
        mySendKeys(state,faker.address().state());
        mySendKeys(zipCode,faker.address().zipCode());
        mySendKeys(phone,faker.phoneNumber().phoneNumber());
        mySendKeys(ssn,faker.number().digits(3));
    }
}
