package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class HomePage extends ReusableMethods {
    public HomePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(name = "username")
    public WebElement userNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath ="//input[@class='button']")
    public WebElement loginBtn;
}
