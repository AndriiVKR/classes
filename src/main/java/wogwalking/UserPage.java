package wogwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class UserPage extends BasePage {

    public UserPage(WebDriver driver) {
        super(driver);
    }

@FindBy(css = ".sc-eNQAEJ.jHVdxB")
    List<WebElement> userInformationButton;

    public void clickUserInformationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(userInformationButton.get(0)));
        userInformationButton.get(0).click();
    }

    @FindBy(css = ".sc-VigVT.laKGfy")
    List<WebElement> userNikName;

    public String getUserNikName() {
        wait.until(ExpectedConditions.visibilityOf(userNikName.get(0)));
        return userNikName.get(0).getText();

    }
}
