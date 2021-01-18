package wogwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class IntermediatePage extends BasePage {

    public IntermediatePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = ".sc-cmTdod.bOQSIS")
  /* [0] - justExlploringButton
     [1] - nextButton
  */
        private List<WebElement> justExploringButton;

        public ApplyPage clickJustExploringButton() {
            wait.until(ExpectedConditions.elementToBeClickable(justExploringButton.get(0)));
            justExploringButton.get(0).click();
            return new ApplyPage(driver);
        }



}
