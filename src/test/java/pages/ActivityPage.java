package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class ActivityPage extends ReusableMethods {
    public ActivityPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@id='accountDetails']")
    public WebElement accountDetails;

    @FindBy(xpath = "//table[@id='transactionTable']")
    public WebElement transactionTable;

    @FindBy(linkText = "transaction.htm?id=114487")
    public WebElement transactionLink;
}
