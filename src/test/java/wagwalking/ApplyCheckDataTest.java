package wagwalking;

import org.junit.Assert;
import org.junit.Test;
import wogwalking.ApplyPage;
import wogwalking.HomePage;
import wogwalking.IntermediatePage;

public class ApplyCheckDataTest extends BaseTest {

    @Test
    public void testApplyCheckData() {

        homePage = new HomePage(driver);
        intermediatePage = homePage.clickBookAWalkButton();

        applyPage = intermediatePage.clickJustExploringButton();

        applyPage.inputFirstName(client.getFirstName());
        String firstName = applyPage.getFirstName();
        Assert.assertEquals(client.getFirstName(), firstName);

        applyPage.inputLastName(client.getLastName());
        String lastName = applyPage.getLastName();
        Assert.assertEquals(client.getLastName(), lastName);

        applyPage.inputEmail(client.getEmail());
        String email = applyPage.getEmail();
        Assert.assertEquals(client.getEmail(), email);

        applyPage.inputPhone(client.getPhone());
        String phone = applyPage.getPhone();
        Assert.assertEquals(client.getPhone(), phone);



    }
}
