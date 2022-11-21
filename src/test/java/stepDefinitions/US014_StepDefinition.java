package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US014_Page;
import utilities.Driver;

import java.util.List;

public class US014_StepDefinition {
    US014_Page us014_page = new US014_Page();
    @Then("kullanici yatan hasalari tiklar")
    public void kullaniciYatanHasalariTiklar() {
        us014_page.myPages.click();
        us014_page.myInpatients.click();
    }

    @And("kullanici yatan hasta duzenleye tiklar")
    public void kullaniciYatanHastaDuzenleyeTiklar() {
        us014_page.edit.click();
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
