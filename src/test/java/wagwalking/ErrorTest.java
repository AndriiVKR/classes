package wagwalking;

import org.junit.Test;
import wogwalking.ApplyPage;
import wogwalking.HomePage;
import wogwalking.IntermediatePage;

public class ErrorTest extends BaseTest {

    @Test
    public void testError() {

        homePage = new HomePage(driver);
        intermediatePage = homePage.clickBookAWalkButton();

        applyPage = intermediatePage.clickJustExploringButton();

        ApplyPage applyPage = new ApplyPage(driver);
        applyPage.clickFirstNameField();
        applyPage.clickLastNameField();
        applyPage.clickEmailField();
        applyPage.clickPasswordField();
        applyPage.clickPhoneField();
        applyPage.clickFirstNameField();
        applyPage.errorMessageFirstName();
        applyPage.errorMessageLastName();
        applyPage.errorMessagePasswordField();
        applyPage.errorMessagePhoneNumberField();
        applyPage.errorMessageEmailField();



    }
}
