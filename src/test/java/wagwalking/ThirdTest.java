package wagwalking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThirdTest extends BaseTest {

    @Test
    public void testThird() {
        WebElement bookAWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));
        bookAWalkButton.click();

        List<WebElement> justExploringButton = driver.findElements(By.cssSelector(".sc-cmTdod.bOQSIS"));
        justExploringButton.get(0).click();

        List<WebElement> inputFields = driver.findElements(By.cssSelector(".sc-ktHwxA.sc-cIShpX.dFBqoT"));
        inputFields.get(0).sendKeys(client.getFirstName());
        inputFields.get(1).sendKeys(client.getLastName());
        inputFields.get(2).sendKeys(client.getEmail());
        inputFields.get(3).sendKeys(client.getPhone());
        inputFields.get(4).sendKeys(client.getPassword());






    }



}
