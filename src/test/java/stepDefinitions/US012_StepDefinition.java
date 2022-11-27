package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.US012_Page;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;

public class US012_StepDefinition {
    US012_Page us012_page = new US012_Page();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

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


    @And("kullanici statusu UNAPPROVED secer")
    public void kullaniciStatusuUNAPPROVEDSecer() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", us012_page.status);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us012_page.status.click();
        Thread.sleep(2000);
        us012_page.unapproved.click();
        Thread.sleep(2000);
        //us012_page.save.click();

    }

    @And("kullanici hasta bilgilerini doldurur")
    public void kullaniciHastaBilgileriniDoldurur() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", us012_page.anamnesis);


    }

    @And("kullanici kaydet butonuna tiklar")
    public void kullaniciKaydetButonunaTiklar() {
        js.executeScript("arguments[0].scrollIntoView;", us012_page.saveButton);
        us012_page.saveButton.click();
    }

    @And("kullanici {string} testlerini secer")
    public void kullaniciTestleriniSecer(String tests) {

        List<String> names = new ArrayList<>();
        String[] testList = tests.replace("{", "").replace("}", "").split(",");
        for (WebElement w : us012_page.nameList) {
            names.add(w.getText());

        }
        int sayac = 0;
        for (int i = 0; i < names.size(); i++) {
            for (String s: testList) {
                if (s.equals(names.get(i))){
                    js.executeScript("arguments[0].scrollIntoView(true);",Driver.getDriver().
                            findElement(By.xpath("(//*[@type='checkbox'])" + "[" + (i+1) + "]")));
                    js.executeScript("arguments[0].click();", Driver.getDriver().
                            findElement(By.xpath("(//*[@type='checkbox'])" + "[" + (i+1) + "]")));
                    sayac++;

                }

            }

        }
      }

    @Then("kullanici yatan hasta bilgilerini dogrular")
    public void kullanici_yatan_hasta_bilgilerini_dogrular() {

        List<WebElement> basliklar = Driver.getDriver().findElements(By.xpath("//th/span"));
        for (WebElement w:basliklar) {
            System.out.println(w.getText());
            
        }


        }

    @And("kullanici yatan hasta duzenleye tiklar")
    public void kullaniciYatanHastaDuzenleyeTiklar() {
        us012_page.editButton.click();

    }

    @And("kullanici statusu STAYING secer")
    public void kullaniciStatusuSTAYINGSecer() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", us012_page.status);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us012_page.status.click();
        Thread.sleep(2000);
        us012_page.staying.click();
        Thread.sleep(2000);


    }

    @And("kullanici kaydede tiklar")
    public void kullaniciKaydedeTiklar() {
        js.executeScript("arguments[0].scrollIntoView(true);", us012_page.save);
        js.executeScript("arguments[0].click();", us012_page.save);


    }

    @And("kullanici statusu DISCHARGED secer")
    public void kullaniciStatusuDISCHARGEDSecer() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", us012_page.status);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us012_page.status.click();
        Thread.sleep(2000);
        us012_page.discharged.click();
        Thread.sleep(2000);
    }

    @And("kullanici statusu CANCELLED secer")
    public void kullaniciStatusuCANCELLEDSecer() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", us012_page.status);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us012_page.status.click();
        Thread.sleep(2000);
        us012_page.cancelled.click();
        Thread.sleep(2000);
    }

    @And("kullanici oda secer")
    public void kullaniciOdaSecer() throws InterruptedException {
        ////select/option[contains(text(),'675210')]
        js.executeScript("arguments[0].scrollIntoView(true);", us012_page.room);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us012_page.room.click();
        Thread.sleep(2000);
        us012_page.room3661578.click();
        Thread.sleep(2000);


    }

    @And("kullanici yeni yatan hasta duzenleye tiklar")
    public void kullaniciYeniYatanHastaDuzenleyeTiklar() {
        us012_page.editButtonUnapproved.click();

    }

    @And("kullanici odanin onaylandigini dogrular")
    public void kullaniciOdaninOnaylandiginiDogrular() {
        //actions.moveToElement(us012_page.roomUpdate).clickAndHold().;
        actions.moveToElement(us012_page.roomUpdate).click().perform();


    }


}



