package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class FirstTest {

    @Test
    public void testFirst() {

        System.setProperty("webdriver.chrome.driver", "D:\\test\\java\\chromedriver1.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://wagwalking.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "WagWalking.com | Local Dog Walkers, Pet Sitters, Trainers and More";

        Assert.assertEquals(expectedTitle, actualTitle);

        WebElement bookAWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookAWalkButton.click();

        List<WebElement> justExploringButton = driver.findElements(By.cssSelector(".sc-cmTdod.bOQSIS"));
        justExploringButton.get(0).click();

        Client client = new Client("gas@gas.com", "12345", "Ivan", "Ivanov", "222 222 2222");



        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));
//        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
//        firstNameField.sendKeys(client.getFirstName());
        inputFields.get(0).sendKeys(client.getFirstName());
        inputFields.get(1).sendKeys(client.getLastName());
        inputFields.get(2).sendKeys(client.getEmail());
        inputFields.get(3).sendKeys(client.getPhone());
        inputFields.get(4).sendKeys(client.getPassword());


    }
}
