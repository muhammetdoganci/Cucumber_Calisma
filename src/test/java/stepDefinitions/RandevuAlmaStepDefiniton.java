package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class RandevuAlmaStepDefiniton {
    @Given("hasta {string} sayfasina gider")
    public void hastaSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @And("randevu al bolumune gider")
    public void randevuAlBolumuneGider() {

    }

    @And("isim {string} girer")
    public void isimGirer(String arg0) {
    }

    @And("soyisim {string} girer")
    public void soyisimGirer(String arg0) {
    }

    @And("SSN {string} girer")
    public void ssnGirer(String arg0) {
    }

    @And("Email {string} girer")
    public void emailGirer(String arg0) {
    }

    @And("Phone {string} girer")
    public void phoneGirer(String arg0) {
    }

    @And("Appointment DateTime {string} girer")
    public void appointmentDateTimeGirer(String arg0) {
    }

    @Then("hasta rendevu al butonuna tiklar")
    public void hastaRendevuAlButonunaTiklar() {
    }

    @And("randevu olusturuldugunu dogrular")
    public void randevuOlusturuldugunuDogrular() {
    }

    @And("hasts sayfayi kapatir")
    public void hastsSayfayiKapatir() {
    }
}
