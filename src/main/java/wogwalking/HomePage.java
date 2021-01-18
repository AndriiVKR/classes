package wogwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-bxivhb.dmgvyV")
    private WebElement bookAWalkButton;

    @FindBy(css = ".sc-bdVaJa.fyUNwb.sc-dnqmqq.kmaLgG")
    private List<WebElement> loginButton;

    @FindBy(css = ".sc-gzVnrw.jcfBHg")
    private List<WebElement> servicesButton;


    public IntermediatePage clickBookAWalkButton() {
        wait.until(ExpectedConditions.elementToBeClickable(bookAWalkButton));
        bookAWalkButton.click();
        return new IntermediatePage(driver);
    }

    public LoginPage clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton.get(1)));
        loginButton.get(1).click();
        return new LoginPage(driver);
    }

    public void clickServicesButton() {
        wait.until(ExpectedConditions.elementToBeClickable(servicesButton.get(1)));
        servicesButton.get(1).click();
    }



}
