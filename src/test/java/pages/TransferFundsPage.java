package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseDriver;

import java.util.List;
import java.util.Random;

public class TransferFundsPage {
    public TransferFundsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement verifyTransferFundsPageText;

    @FindBy(id = "amount")
    public WebElement textAmount;

    @FindBy(id = "fromAccountId")
    public WebElement selectFromAccount;

    @FindBy(id = "toAccountId")
    public WebElement selectToAccount;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement transferBtn;

    public void enterRandomAmount() {
        Random random = new Random();
        int randomAmount = random.nextInt(100000) + 1;
        textAmount.sendKeys(String.valueOf(randomAmount));
    }

    public void selectSameAccountForTransfer() {
        Select selectFrom = new Select(selectFromAccount);
        Select selectTo = new Select(selectToAccount);

        List<WebElement> options = selectFrom.getOptions();

        Random random = new Random();
        int randomIndex = random.nextInt(options.size() - 1) + 1;
        String sameValue = options.get(randomIndex).getAttribute("value");
        selectFrom.selectByValue(sameValue);
        selectTo.selectByValue(sameValue);

    }
}
