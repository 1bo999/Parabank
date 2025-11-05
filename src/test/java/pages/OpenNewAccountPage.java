package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class OpenNewAccountPage extends ReusableMethods {
    public OpenNewAccountPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[1]/h1")
    public WebElement openNewAccountText;

    @FindBy(xpath = "//form/select[1]")
    public WebElement typeOfAccount;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement whichAccount;

    @FindBy(xpath = "//*[@value='Open New Account']")
    public WebElement openNewAccountBtn;

    @FindBy(xpath = "//div/p[2]/b")
    public WebElement newAccountText;
}
