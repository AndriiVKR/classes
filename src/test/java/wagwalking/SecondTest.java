package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SecondTest extends BaseTest{

    @Test
    public void testSecond() {

        WebElement bookAWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));
        bookAWalkButton.click();

        List<WebElement> justExploringButton = driver.findElements(By.cssSelector(".sc-cmTdod.bOQSIS"));
        justExploringButton.get(0).click();


        List<WebElement> inputFields = driver.findElements(By.cssSelector(".sc-ktHwxA.sc-cIShpX.dFBqoT"));
        inputFields.get(0).click();
        inputFields.get(1).click();
        inputFields.get(2).click();
        inputFields.get(3).click();
        inputFields.get(4).click();
//        inputFields.get(0).sendKeys(client.getFirstName());
//        inputFields.get(1).sendKeys(client.getLastName());
//        inputFields.get(2).sendKeys(client.getEmail());
//        inputFields.get(3).sendKeys(client.getPhone());
//        inputFields.get(4).sendKeys(client.getPassword());
        

//        WebElement accountButton = driver.findElement(By.cssSelector("input[name=\"email\"]"));
//        accountButton.click();

        List<WebElement> errorMessage = driver.findElements(By.cssSelector(".sc-fYxtnH.jBqnYt"));

        String firsNameError = errorMessage.get(0).getText();
        String expFirsNameError = "First name is a required field";
        Assert.assertEquals(expFirsNameError, firsNameError);

        String lastNameError = errorMessage.get(1).getText();
        String expLastNameError = "Last name is a required field";
        Assert.assertEquals(expLastNameError, lastNameError);


        String emailError = errorMessage.get(2).getText();
        String expEmailError = "Email is a required field";
        Assert.assertEquals(expEmailError, emailError);

        String phoneNumberError = errorMessage.get(3).getText();
        String expPhoneNumberError ="Phone number is a required field";
        Assert.assertEquals(expPhoneNumberError, phoneNumberError);

        String accPassError = errorMessage.get(4).getText();
        String expAccPassError = "Account password is a required field";
        Assert.assertEquals(expAccPassError, accPassError);


    }
}
