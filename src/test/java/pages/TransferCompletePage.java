package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class TransferCompletePage {
    public TransferCompletePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//h1[@class='title'])[2]")
    public WebElement transferCompleteMessage;

    @FindBy(xpath = "(//h1[@class='title']/following-sibling::p)[3]")
    public WebElement verifyTransactionsDetails;

    @FindBy(linkText = "Accounts Overview")
    public WebElement clickAccountOverview;
}
