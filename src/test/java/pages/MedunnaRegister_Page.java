package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRegister_Page {


    public MedunnaRegister_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[contains(text(),'Register')]")
    public WebElement register;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@class=\"form-group\"]")
    public WebElement ssnBlue;



}
