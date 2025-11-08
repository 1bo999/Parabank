package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class TransferFundsPage extends ReusableMethods {
    public TransferFundsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement verifyTransferFundsPageText;

    @FindBy(id = "amount")
    public WebElement textAmount;

    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement fromAccount;

    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement toAccount;

    @FindBy(xpath = "//select[@id='toAccountId']/option")
    public List<WebElement> fromAccountOps;

    @FindBy(xpath = "//select[@id='toAccountId']/option")
    public List<WebElement> toAccountOps;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement transferBtn;

    public void selectSameAccountForTransfer() {
        myClick(fromAccount);
        myClick(fromAccountOps.getFirst());

        myClick(toAccount);
        myClick(toAccountOps.getFirst());
    }
}
