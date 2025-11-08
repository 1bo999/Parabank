package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class ActivityPage extends ReusableMethods {
    public ActivityPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@id='accountDetails']")
    public WebElement accountDetailsText;

    @FindBy(xpath = "//table[@id='transactionTable']")
    public WebElement transactionTable;

    @FindBy(xpath = "//tbody/tr/td[2]/a")
    public List<WebElement> transactionLink;
}
