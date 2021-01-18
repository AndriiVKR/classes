package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import wogwalking.HomePage;

import java.util.logging.Logger;

public class LoginTest extends BaseTest {

    private static Logger log = Logger.getLogger(LoginTest.class.getName());

    @Test
    public void testLogin() {
        homePage = new HomePage(driver);
        log.info("Test is starting, Home page is open...");
        loginPage = homePage.clickLoginButton();
        log.info("On Home Page Login button is click");
        loginPage.inputEmailField(excClient.getEmail());
        log.info("In field email input email /*test.16.av@gmail.com*/");
        loginSecondPage = loginPage.clickContinueButton();
        log.info("Click on Continue Button, and next User Page should be open");
        loginSecondPage.clickSingInViaPasswordButton();
        log.info("User Is clicking on Sign in via password button");
        loginSecondPage.inputPasswordField(excClient.getPassword());
        log.info("User input password /**/");
        userPage = loginSecondPage.clickSingInButton();
        log.info("User is clicking on Sing in button, and should be open User Page");
        userPage.clickUserInformationButton();
        log.info("In order to see information about user user should be click button");
        String actUser = userPage.getUserNikName();
        Assert.assertEquals(excClient.getFirstName() + " " + excClient.getLastName(), actUser);
        log.info("We compering user from date base in app with user which data we have imputed");









    }
}
