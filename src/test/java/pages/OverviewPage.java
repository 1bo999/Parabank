package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class OverviewPage extends ReusableMethods {

    public OverviewPage(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//p[@class='smallText']/b")
    public WebElement overViewText;

    @FindBy(xpath = "(//div[@id='leftPanel']/ul/li)[6]")
    public WebElement updateContactInfoBtn;

    @FindBy(xpath = "//table[@id='accountTable']")
    public WebElement accountTable;

    @FindBy(linkText = "activity.htm?id=22224")
    public WebElement accountNumber;
}
