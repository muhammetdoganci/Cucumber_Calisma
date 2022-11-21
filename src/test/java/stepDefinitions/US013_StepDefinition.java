package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US012_Page;
import pages.US013_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US013_StepDefinition {
    US013_Page us013_page = new US013_Page();


    @Then("kullanici randevulu hastalari goruntuler")
    public void kullaniciRandevuluHastalariGoruntuler() {
        us013_page.myPages.click();
        us013_page.myAppoitments.click();

    }
    @And("kullanici hasta düzenleye tiklar")
    public void kullaniciHastaDüzenleyeTiklar() {
        us013_page.edit.click();
    }

    @And("kullanici test sonuclarini goruntuler")
    public void kullaniciTestSonuclariniGoruntuler() {
        us013_page.testResults.click();
    }

    @And("kullanici test sonucunu gorur")
    public void kullaniciTestSonucunuGorur() {
        us013_page.viewResults.click();
        List<WebElement> testBasliklari = Driver.getDriver().findElements(By.xpath("//tr/th"));
        for (int i = 0; i < testBasliklari.size(); i++) {

            System.out.println(testBasliklari.get(i).getText());
            testBasliklari.get(i).isDisplayed();

        }

        List<WebElement> testTable = Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        for (WebElement table: testTable) {
            System.out.println(table.getText());
            table.isDisplayed();


        }

    }

    @And("kullanici hastaya yatis talep eder")
    public void kullaniciHastayaYatisTalepEder() {
        us013_page.requestInpatient.click();

    }
}
