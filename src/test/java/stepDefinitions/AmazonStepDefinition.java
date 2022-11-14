package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
    amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String expectedData = "Nutella";
        String actualData = amazonPage.aramaSonucu.getText();
        System.out.println("actualData = " + actualData);
        assertTrue(actualData.contains(expectedData));

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
       Driver.closeDriver();
    }
}
