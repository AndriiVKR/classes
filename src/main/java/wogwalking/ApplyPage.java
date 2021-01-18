package wogwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css =".sc-hEsumM.gcdHFe")
    private WebElement firstNameField;

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public String getFirstName() {
        wait.until(ExpectedConditions.visibilityOf(firstNameField));
        String firstName = firstNameField.getAttribute("value");
        return firstName;
    }
    public void clickFirstNameField() {
        firstNameField.click();
    }

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement inputLastNameField;

    public void inputLastName(String lastName) {
        inputLastNameField.sendKeys(lastName);
    }
    public String getLastName() {
        wait.until(ExpectedConditions.visibilityOf(inputLastNameField));
        String lastName = inputLastNameField.getAttribute("value");
        return lastName;
    }
    public void clickLastNameField() {
        inputLastNameField.click();
    }

    @FindBy(css ="input[name=\"email\"]")
    private WebElement inputEmailField;

    public void inputEmail(String email) {
        inputEmailField.sendKeys(email);
    }
    public String getEmail() {
        wait.until(ExpectedConditions.visibilityOf(inputEmailField));
        String email = inputEmailField.getAttribute("value");
        return email;
    }
    public void clickEmailField() {
        inputLastNameField.click();
    }

    @FindBy(css ="input[name=\"password\"]")
    private WebElement inputPasswordField;

    public void inputPassword(String password) {
        inputPasswordField.sendKeys(password);
    }
    public void clickPasswordField() {
        inputPasswordField.click();
    }

    @FindBy(css ="input[name=\"phone\"]" )
    private WebElement inputPhoneField;

    public void inputPhone(String phone) {
        inputPhoneField.sendKeys(phone);
    }

    public String getPhone() {
        wait.until(ExpectedConditions.visibilityOf(inputPhoneField));
        String phone = inputPhoneField.getAttribute("value");
        return phone;

    }
    public void clickPhoneField() {
        inputPhoneField.click();
    }

    @FindBy(css =".sc-fYxtnH.jBqnYt")
    List<WebElement> errorMessages;

    public String errorMessageFirstName() {
        wait.until(ExpectedConditions.visibilityOf(errorMessages.get(0)));
        return errorMessages.get(0).getText();
    }

    public String errorMessageLastName() {
        wait.until(ExpectedConditions.visibilityOf(errorMessages.get(1)));
        return errorMessages.get(1).getText();
    }

    public String errorMessageEmailField() {
        wait.until(ExpectedConditions.visibilityOf(errorMessages.get(2)));
        return errorMessages.get(2).getText();
    }

    public String errorMessagePhoneNumberField() {
        wait.until(ExpectedConditions.visibilityOf(errorMessages.get(3)));
        return errorMessages.get(3).getText();
    }

    public String errorMessagePasswordField() {
        wait.until(ExpectedConditions.visibilityOf(errorMessages.get(4)));
        return errorMessages.get(4).getText();
    }

    @FindBy(css =".sc-fYxtnH.jBqnYt")
    List<WebElement> incorrectDataErrorMessages;

    public String incorrectEmailErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(incorrectDataErrorMessages.get(1)));
        return incorrectDataErrorMessages.get(1).getText();
    }
    public String incorrectPasswordErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(incorrectDataErrorMessages.get(3)));
       return incorrectDataErrorMessages.get(3).getText();
    }

    @FindBy(css = "sc-gxMtzJ jeyTRq")
    WebElement checkBoxTermsCond;

    public void clickCheckBox() {
        checkBoxTermsCond.click();
    }

    @FindBy(css = ".sc-ckVGcZ.jxKTKG")
    WebElement termsCond;

    public void clickTermsCondStr() {
        termsCond.click();
    }

    @FindBy(css = ".sc-cmTdod.bOQSIS")
    List<WebElement> termsCondAcceptCancel;
//    [1] cancel Terms & Conditions
    public void clickAcceptTermsCondButton() {
        termsCondAcceptCancel.get(0).click();
    }

    @FindBy(css = ".sc-cmTdod.bOQSIS")
    WebElement completeProfile;

    public void clickCompleteProfileButton() {
        completeProfile.click();
    }

    @FindBy(css = ".sc-fYxtnH.jzDLJD")
    WebElement errorMessageCheck;

    public String errorMessageExistAccount() {
        return errorMessageCheck.getText();
    }




}
