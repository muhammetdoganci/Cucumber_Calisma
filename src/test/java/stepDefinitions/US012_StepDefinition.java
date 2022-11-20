package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US012_Page;
import utilities.ConfigReader;
import utilities.Driver;

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

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @And("kullanici testin icerigini dogrular")
    public void kullaniciTestinIceriginiDogrular() {

        WebElement urea = Driver.getDriver().findElement(By.xpath("//*[text()='Urea']"));
        urea.isDisplayed();
        WebElement albumin = Driver.getDriver().findElement(By.xpath("//*[text()='Albumin']"));
        albumin.isDisplayed();
        WebElement creatinine = Driver.getDriver().findElement(By.xpath("//*[text()='Creatinine']"));
        creatinine.isDisplayed();
        WebElement sodium = Driver.getDriver().findElement(By.xpath("(//*[text()='Sodium'])[2]"));
        sodium.isDisplayed();
        WebElement potassium = Driver.getDriver().findElement(By.xpath("(//*[text()='Potassium'])[2]"));
        potassium.isDisplayed();
        WebElement totalProtein = Driver.getDriver().findElement(By.xpath("(//*[text()='Total protein'])[1]"));
        totalProtein.isDisplayed();
        WebElement hemoglobin = Driver.getDriver().findElement(By.xpath("(//*[text()='Hemoglobin'])[1]"));
        hemoglobin.isDisplayed();
        WebElement glucose = Driver.getDriver().findElement(By.xpath("(//*[text()='Glucose'])[1]"));
        glucose.isDisplayed();


        /*

        List<WebElement> testler = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));
        for (int i = 0; i < testler.size(); i++) {
            System.out.println(testler.get(i).getText());
        }
         */


    }
}
