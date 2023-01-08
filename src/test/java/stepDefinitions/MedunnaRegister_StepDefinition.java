package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaRegister_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaRegister_StepDefinition {
    MedunnaRegister_Page registerPage = new MedunnaRegister_Page();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());
    @Given("user goes to url")
    public void userGoesToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("clicks the register button")
    public void clicksTheRegisterButton() {
        registerPage.accountMenu.click();
        registerPage.register.click();
        //jse.executeScript("arguments[0].click();", registerPage.accountMenu);
        //jse.executeScript("arguments[1]).click();", registerPage.register);

    }

    @And("user enters {int} digit SSN with {string} after {int}rd and {int}th digits in SSN")
    public void userEntersDigitSSNWithAfterRdAndThDigitsInSSN(int arg0, String arg1, int arg2, int arg3) {
        String ssnIlkUc = Faker.instance().number().digits(3);
        String ssnOrta = Faker.instance().number().digits(2);
        String ssnSon = Faker.instance().number().digits(4);

        registerPage.ssn.sendKeys(ssnIlkUc, "-", ssnOrta, "-", ssnSon, Keys.ENTER, Keys.TAB);

        faker.idNumber().ssnValid();
    }

    @Then("user sees SSN box is blue")
    public void userSeesSSNBoxIsBlue() {
        Assert.assertTrue(registerPage.ssnBlue.isDisplayed());
    }

    @And("user waits {int} seconds")
    public void userWaitsSeconds(int istenilenSure) {
        try{
            Thread.sleep(istenilenSure*1000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }


    @And("user enters first name, last name, user name and e-mail address")
    public void userEntersFirstNameLastNameUserNameAndEMailAddress() {
        jse.executeScript("arguments[0].click();", registerPage.firstName);
        action.sendKeys(faker.name().firstName(), Keys.ENTER, Keys.TAB,
                faker.name().lastName(), Keys.ENTER, Keys.TAB,
                faker.name().username(), Keys.ENTER, Keys.TAB,
                faker.internet().emailAddress(), Keys.ENTER, Keys.TAB).perform();

    }

    @And("The user enters a strong {int}-character password consisting of at least {int} lowercase, {int} uppercase letter, at least {int} character and {int} number")
    public void theUserEntersAStrongCharacterPasswordConsistingOfAtLeastLowercaseUppercaseLetterAtLeastCharacterAndNumber(int arg0, int arg1, int arg2, int arg3, int arg4) {
        action.sendKeys("aa","BB","123","/*-", Keys.ENTER, Keys.TAB,
                "aa","BB","123","/*-", Keys.ENTER).perform();

        registerPage.passwordColor.isDisplayed();

        jse.executeScript("arguments[0].click();", registerPage.registerSubmit);
        jse.executeScript("arguments[0].scrollIntoView(true);", registerPage.alert);
        registerPage.alert.isDisplayed();
        System.out.println("alert = " + registerPage.alert.getText());
        System.out.println("alert class ile = " + registerPage.alertClass.getText());

        String expectedAlert = "Registration Saved";
        String actualAlert = registerPage.alert.getText();

        Assert.assertEquals(expectedAlert, actualAlert);

    }

    @And("user close the page")
    public void userCloseThePage() {
        Driver.closeDriver();
    }
}
