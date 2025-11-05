package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class LoggedInPage extends ReusableMethods {
    public LoggedInPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//p/b")
    public WebElement welcomeText;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[1]/a")
    public WebElement openNewAccountBtn ;
    @FindBy(linkText = "Request Loan")
    public WebElement requestLoan;
}
