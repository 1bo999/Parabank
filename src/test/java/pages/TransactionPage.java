package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class TransactionPage extends ReusableMethods {
    public TransactionPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@id='rightPanel']/h1")
    public WebElement transactionDetailsText;

    @FindBy(xpath = "//td[b[text()='Date:']]/following-sibling::td")
    public WebElement paymentDate;

    @FindBy(xpath = "//table/tbody/tr[3]/td[2]")
    public WebElement paymentDescription;

    @FindBy(xpath = "//td[b[text()='Amount:']]/following-sibling::td")
    public WebElement paymentAmount;
}
