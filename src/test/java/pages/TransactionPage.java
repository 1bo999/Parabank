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
    public WebElement transactionDetails;

    @FindBy(xpath = "//td[b[text()='Date:']]/following-sibling::td")
    public WebElement paymentDate;

    @FindBy(xpath = "//td[b[text()='Description:']]/following-sibling::td")
    public WebElement paymentDescription;

    @FindBy(xpath = "//td[b[text()='Amount:']]/following-sibling::td")
    public WebElement paymentAmount;
}
