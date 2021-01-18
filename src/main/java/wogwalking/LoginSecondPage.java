package wogwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginSecondPage extends BasePage {

    public LoginSecondPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(css = ".sc-gwVKww.cCMYLj")
    List<WebElement> singInViaPasswordButton;

    public void clickSingInViaPasswordButton() {
        wait.until(ExpectedConditions.elementToBeClickable(singInViaPasswordButton.get(1)));
        singInViaPasswordButton.get(1).click();
    }

    @FindBy(css = ".sc-feJyhm.sc-iELTvK.iyrbbW")
    List<WebElement> passwordField;

    public void inputPasswordField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField.get(0)));
        passwordField.get(0).sendKeys(password);
    }

    @FindBy(css = "sc-cmTdod bOQSIS")
    List<WebElement> singInButton;

    public UserPage clickSingInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(singInButton.get(0)));
        singInButton.get(0).click();
        return new UserPage(driver);
    }
}
