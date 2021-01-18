package wogwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

        @FindBy(css = ".sc-feJyhm.sc-iELTvK.iyrbbW")
        List<WebElement> emailField;

        public void inputEmailField(String email) {
            wait.until(ExpectedConditions.visibilityOf(emailField.get(0)));
            emailField.get(0).sendKeys(email);
        }

        @FindBy(css = ".sc-cmTdod.bOQSIS")
        List<WebElement> continueButton;

        public LoginSecondPage clickContinueButton() {
            wait.until(ExpectedConditions.elementToBeClickable(continueButton.get(0)));
            continueButton.get(0).click();
            return new LoginSecondPage(driver);
        }






}
