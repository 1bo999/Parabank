package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

public class RequestLoanPage extends ReusableMethods {
    public RequestLoanPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(id = "amount")
    public WebElement loanAmountInput;

    @FindBy(id = "downPayment")
    public WebElement downPaymentInput;

    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowBtn;

    @FindBy(xpath = "//div[@id='loanRequestApproved']/p[1]")
    public WebElement approvedText;

    @FindBy(id = "newAccountId")
    public WebElement newAccountLink;
}
