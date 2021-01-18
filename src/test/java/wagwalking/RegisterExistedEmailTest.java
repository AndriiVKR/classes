package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import wogwalking.ApplyPage;
import wogwalking.HomePage;
import wogwalking.IntermediatePage;

import java.util.logging.Logger;

public class RegisterExistedEmailTest extends BaseTest {

    private static Logger log = Logger.getLogger(RegisterExistedEmailTest.class.getName());

    @Test
    public void testRegisterExistedEmail() throws InterruptedException {

        homePage = new HomePage(driver);
        log.info("Home page is opened, and test is started...");
        intermediatePage = homePage.clickBookAWalkButton();
        log.info("On Home page user clicked Book A Walk button, end next page is opened");

        applyPage = intermediatePage.clickJustExploringButton();

        ApplyPage applyPage = new ApplyPage(driver);
        applyPage.inputFirstName(client.getFirstName());
        applyPage.inputLastName(client.getLastName());
        applyPage.inputEmail("alex@gmail.com");
        applyPage.inputPassword(client.getPassword());
        applyPage.inputPhone(client.getPhone());
        applyPage.clickTermsCondStr();
        applyPage.clickAcceptTermsCondButton();
        applyPage.clickCheckBox();
        applyPage.clickCompleteProfileButton();
        Thread.sleep(3000);
        Assert.assertEquals("Looks like you already have an account. Please go to \"My account\" instead, " +
                "or enter a different email.\n" + "\n", applyPage.errorMessageExistAccount());

    }
}
