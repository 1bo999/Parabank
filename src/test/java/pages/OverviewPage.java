package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class OverviewPage extends ReusableMethods {

    public OverviewPage(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//p/b")
    public WebElement welcomeTextName;

    @FindBy(xpath = "//div/div[1]/h1")
    public WebElement overViewText;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[1]/a")
    public WebElement openNewAccountBtn ;

    @FindBy(linkText = "Transfer Funds")
    public WebElement TransferFunds;

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoan;

    @FindBy(linkText = "billpay.htm")
    public WebElement billPayBtn;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[6]/a")
    public WebElement updateContactInfoBtn;

    @FindBy(xpath = "//table[@id='accountTable']")
    public WebElement accountTable;

    @FindBy(linkText = "activity.htm?id=22224")
    public WebElement accountNumber;
}
