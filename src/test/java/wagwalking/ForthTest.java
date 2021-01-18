package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForthTest extends BaseTest {

    @Test
    public void testForth() {
        WebElement bookAWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));
        bookAWalkButton.click();

        List<WebElement> justExploringButton = driver.findElements(By.cssSelector(".sc-cmTdod.bOQSIS"));
        justExploringButton.get(0).click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector(".sc-ktHwxA.sc-cIShpX.dFBqoT"));
        inputFields.get(0).sendKeys(clientIncorrect.getFirstName());
        inputFields.get(1).sendKeys(clientIncorrect.getLastName());
        inputFields.get(2).sendKeys(clientIncorrect.getEmail());
        inputFields.get(3).sendKeys(clientIncorrect.getPhone());
        inputFields.get(4).sendKeys(clientIncorrect.getPassword());

        List<WebElement> errorMessage = driver.findElements(By.cssSelector(".sc-fYxtnH.jBqnYt"));
        String expValidEmail = errorMessage.get(1).getText();
        String validEmail = "Email must be a valid email";
        Assert.assertEquals(expValidEmail, validEmail);

        String expPassMessage =  errorMessage.get(3).getText();
        String passMessage = "8 characters required";
        Assert.assertEquals(expPassMessage, passMessage);









    }



}
