package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LoggedInPage {
    public LoggedInPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//p/b")
    public WebElement welcomeText;

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoan;
}
