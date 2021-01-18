package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import wogwalking.ApplyPage;
import wogwalking.HomePage;
import wogwalking.IntermediatePage;

public class ApplyTest extends BaseTest {

    @Test
    public void testApply() {

        homePage = new HomePage(driver);
        intermediatePage = homePage.clickBookAWalkButton();

        applyPage = intermediatePage.clickJustExploringButton();

        applyPage.inputFirstName(client.getFirstName());
        applyPage.inputLastName(client.getLastName());
        applyPage.inputEmail(client.getEmail());
        String email = applyPage.getEmail();
        Assert.assertEquals(client.getEmail(), email);
        applyPage.inputPassword(client.getPassword());
        applyPage.inputPhone(client.getPhone());








    }


}
