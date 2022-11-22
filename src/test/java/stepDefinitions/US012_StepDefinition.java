package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US012_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US012_StepDefinition {
    US012_Page us012_page = new US012_Page();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("kullanici Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        us012_page.signIn.click();
        us012_page.login.click();

    }

    @And("Username ve Password girer")
    public void usernameVePasswordGirer() {
        us012_page.username.sendKeys(ConfigReader.getProperty("drUsername"));
        us012_page.password.sendKeys(ConfigReader.getProperty("drPassword"));

    }
    @And("kullanici doktor hesabi ile giris yapar")
    public void kullaniciDoktorHesabiIleGirisYapar() {
        us012_page.signInGiris.click();
    }

    @Then("kullanici atanan hastalari goruntuler")
    public void kullaniciAtananHastalariGoruntuler() {
        us012_page.myPages.click();
        us012_page.myAppoitments.click();
    }
    @And("kullanici hasta duzenleye tiklar")
    public void kullaniciHastaDuzenleyeTiklar() {
        us012_page.edit.click();
    }

    @And("kullanici request a test botununa tiklar")
    public void kullaniciRequestATestBotununaTiklar() {
        us012_page.requestATest.click();
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("kullanici testleri goruntuler")
    public void kullaniciTestleriGoruntuler() {
        us012_page.testItems.isDisplayed();

    }


    @Then("kullanici randevulu hastalari goruntuler")
    public void kullaniciRandevuluHastalariGoruntuler() {
        us012_page.myPages.click();
        us012_page.myAppoitments.click();
    }
    @And("kullanici test sonuclarini goruntuler")
    public void kullaniciTestSonuclariniGoruntuler() {
        us012_page.testResults.click();
    }
    @And("kullanici test sonucunu gorur")
    public void kullaniciTestSonucunuGorur() {
        us012_page.viewResults.click();
        List<WebElement> testBasliklari = Driver.getDriver().findElements(By.xpath("//tr/th"));
        for (int i = 0; i < testBasliklari.size(); i++) {

            System.out.println(testBasliklari.get(i).getText());
            testBasliklari.get(i).isDisplayed();

        }
/*
        List<WebElement> testTable = Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        for (WebElement table: testTable) {
            System.out.println(table.getText());
            table.isDisplayed();
        }
         */
    }
    @And("kullanici hastaya yatis talep eder")
    public void kullaniciHastayaYatisTalepEder() {
        us012_page.requestInpatient.click();

    }
    @Then("kullanici yatan hasalari tiklar")
    public void kullaniciYatanHasalariTiklar() {
        us012_page.myPages.click();
        us012_page.myInpatients.click();
    }

    @And("kullanici yatan hasta duzenleye tiklar")
    public void kullaniciYatanHastaDuzenleyeTiklar() {
        us012_page.edit.click();
    }

    @And("kullanici hasta olustur ve duzenle bilgilerini goruntuler")
    public void kullaniciHastaOlusturVeDuzenleBilgileriniGoruntuler() {
        List<WebElement> createPatient = Driver.getDriver().findElements(By.xpath("//div/label"));
        for (int i = 0; i < createPatient.size(); i++) {
            System.out.println(createPatient.get(i).getText());
            createPatient.get(i).isDisplayed();

        }

    }
}
