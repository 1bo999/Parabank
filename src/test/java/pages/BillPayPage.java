package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class BillPayPage extends ReusableMethods {
    public BillPayPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeNameInput;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement addressInput;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement stateInput;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public WebElement phoneInput;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement accountInput;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement verifyAccountInput;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amountInput;

    @FindBy(xpath = "//select[@name='fromAccountId']")
    public WebElement selectFromAccount;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPaymentBtn;

    @FindBy(xpath = "//div[@id='billpayResult']/h1")
    public WebElement completedPaymentMessage;

    @FindBy(linkText = "overview.htm")
    public WebElement accountsOverviewBtn;

}
