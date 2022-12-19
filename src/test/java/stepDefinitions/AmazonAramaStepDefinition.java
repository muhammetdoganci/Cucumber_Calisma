package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazon_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonAramaStepDefinition {

    Amazon_Page amazonPage = new Amazon_Page();

    @Given("kullanici {string} web sayfasina gider")
    public void kullaniciWebSayfasinaGider(String amazonUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici {string} icin arama yaapr")
    public void kullaniciIcinAramaYaapr(String arananUrun) {
        amazonPage.aramaKutusu.sendKeys(arananUrun, Keys.ENTER);
    }
    @And("kullanici sonuc yazisini yazdirir")
    public void kullaniciSonucYazisiniYazdirir() {
        String actualAramaSonucuYazisi = amazonPage.aramaYazdir.getText();
        System.out.println("arama icerigi= " + actualAramaSonucuYazisi);
    }
    @And("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String arananUrun) {
        String actualAramaSonucuYazisi = amazonPage.aramaYazdir.getText();
        Assert.assertTrue(actualAramaSonucuYazisi.contains(arananUrun));
    }



}
