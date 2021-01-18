package wagwalking;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wogwalking.*;

public class BaseTest {

    protected static WebDriver driver;
    protected static Client client;
    protected static Client clientIncorrect;
    protected HomePage homePage;
    protected IntermediatePage intermediatePage;
    protected ApplyPage applyPage;
    protected LoginPage loginPage;
    protected static Client excClient;
    protected UserPage userPage;
    protected LoginSecondPage loginSecondPage;

    @BeforeClass
    public static void start() {
        System.setProperty("webdriver.chrome.driver", "D:\\test\\java\\chromedriver1.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://wagwalking.com/");

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "WagWalking.com | Local Dog Walkers, Pet Sitters, Trainers and More";

        Assert.assertEquals(expectedTitle, actualTitle);

        client = new Client("qas@ss.com","123", "Ivan", "Ivanov", "2222222222");

        clientIncorrect = new Client("1111111", "1", "Petr", "Petrov", "123");
        excClient = new Client("test.16av@gmail.com", "205r13R13", "Kos", "Ust",
                "425 555 5555");
    }




//    @AfterClass
//    public static void finish() {
//        driver.quit();
//    }
}
