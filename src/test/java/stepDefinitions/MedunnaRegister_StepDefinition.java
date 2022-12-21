package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.MedunnaRegister_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaRegister_StepDefinition {
    MedunnaRegister_Page registerPage = new MedunnaRegister_Page();
    JavascriptExecutor jse =(JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();
    @Given("user goes to url")
    public void userGoesToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("clicks the register button")
    public void clicksTheRegisterButton() {
        //registerPage.accountMenu.click();
        //registerPage.register.click();
        try {
            registerPage.accountMenu.click();
        }catch (Exception e) {
            jse.executeScript("arguments[0].click();", registerPage.accountMenu);
            jse.executeScript("arguments[0]).click();", registerPage.register);
        }


    }

    @And("user enters {int} digit SSN with {string} after {int}rd and {int}th digits in SSN")
    public void userEntersDigitSSNWithAfterRdAndThDigitsInSSN(int arg0, String arg1, int arg2, int arg3) {
        String ssnIlkUc = Faker.instance().number().digits(3);
        String ssnOrta = Faker.instance().number().digits(2);
        String ssnSon = Faker.instance().number().digits(4);

        registerPage.ssn.sendKeys(ssnIlkUc, "-", ssnOrta, "-", ssnSon, Keys.ENTER);
    }

    @Then("user sees SSN box is blue")
    public void userSeesSSNBoxIsBlue() {
        Assert.assertTrue(registerPage.ssnBlue.isDisplayed());
    }

    @And("user close the page")
    public void userCloseThePage() {
        Driver.closeDriver();
    }

    @And("user waits {int} seconds")
    public void userWaitsSeconds(int istenilenSure) {
        try{
            Thread.sleep(istenilenSure*1000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
