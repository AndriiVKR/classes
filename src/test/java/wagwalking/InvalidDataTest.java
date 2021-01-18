package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import wogwalking.ApplyPage;
import wogwalking.HomePage;
import wogwalking.IntermediatePage;

public class InvalidDataTest extends BaseTest {

    @Test
    public void testInvalidData()  {

        HomePage homePage = new HomePage(driver);
        homePage.clickBookAWalkButton();

        IntermediatePage intermediatePage = new IntermediatePage(driver);
        intermediatePage.clickJustExploringButton();

        ApplyPage applyPage = new ApplyPage(driver);
        applyPage.inputFirstName(clientIncorrect.getLastName());
        applyPage.inputLastName(clientIncorrect.getLastName());
        applyPage.inputEmail(clientIncorrect.getEmail());
        applyPage.inputPassword(clientIncorrect.getPassword());
        Assert.assertEquals("Email must be a valid email", applyPage.incorrectEmailErrorMessage());
        Assert.assertEquals("8 characters required", applyPage.incorrectPasswordErrorMessage());


    }
}
