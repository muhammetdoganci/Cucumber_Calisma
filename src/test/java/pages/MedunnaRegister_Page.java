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

    @FindBy(xpath = "(//a[@role='menuitem'])[2]")
    public WebElement register;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@class=\"form-group\"]")
    public WebElement ssnBlue;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;

    @FindBy(xpath = "//ul[@id='strengthBar']/li[5]")
    public WebElement passwordColor;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerSubmit;

    @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement alert;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement alertClass;

}
