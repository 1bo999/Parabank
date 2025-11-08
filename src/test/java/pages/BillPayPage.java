package pages;

import net.datafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class BillPayPage extends ReusableMethods {
    public BillPayPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//*[@id='billpayForm']/h1")
    public WebElement billPaymntServcText;

    @FindBy(xpath = "//tbody/tr[1]/td/input")
    public WebElement payeeNameInput;

    @FindBy(xpath = "//tbody/tr[2]/td/input")
    public WebElement addressInput;

    @FindBy(xpath = "//tbody/tr[3]/td/input")
    public WebElement cityInput;

    @FindBy(xpath = "//tbody/tr[4]/td/input")
    public WebElement stateInput;

    @FindBy(xpath = "//tbody/tr[5]/td/input")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//tbody/tr[6]/td/input")
    public WebElement phoneInput;

    @FindBy(xpath = "//tbody/tr[8]/td/input")
    public WebElement accountInput;

    @FindBy(xpath = "//tbody/tr[9]/td/input")
    public WebElement verifyAccountInput;

    @FindBy(xpath = "//tbody/tr[11]/td/input")
    public WebElement amountInput;

    @FindBy(xpath = "//select[@name='fromAccountId']")
    public WebElement selectFromAccount;

    @FindBy(xpath = "//select[@name='fromAccountId']/option")
    public List<WebElement> fromAccountOps;

    @FindBy(xpath = "//tbody/tr[14]/td/input")
    public WebElement sendPaymentBtn;

    @FindBy(xpath = "//div[@id='billpayResult']/h1")
    public WebElement completedPaymentMessage;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[2]/a")
    public WebElement accountsOverviewBtn;

    public void fillInfo() {
        Faker faker = new Faker();

        mySendKeys(addressInput,faker.address().streetAddress());
        mySendKeys(cityInput,faker.address().city());
        mySendKeys(stateInput,faker.address().state());
        mySendKeys(zipCodeInput,faker.address().zipCode());
        mySendKeys(phoneInput,faker.phoneNumber().phoneNumber());
        String account = faker.number().digits(3);
        mySendKeys(accountInput,account);
        mySendKeys(verifyAccountInput,account);
    }
}
