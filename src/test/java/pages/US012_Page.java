package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US012_Page {
    public US012_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signIn;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement login;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInGiris;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-calendar-week fa-w-14 fa-fw ']")
    public WebElement myAppoitments;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[2]")
    public WebElement edit;

    @FindBy(xpath = "//*[@class='btn btn-success btn-sm']")
    public WebElement requestATest;

    @FindBy(xpath = "//tbody/tr")
    public WebElement testItems;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-bed fa-w-20 fa-fw ']")
    public WebElement myInpatients;

    @FindBy(xpath = "//*[@class='btn btn-danger btn-sm']")
    public WebElement testResults;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-eye fa-w-18 '])[2]")
    public WebElement viewResults;

    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement requestInpatient;

    @FindBy(xpath = "//*[@id='in-patient-status']")
    public WebElement status;

    @FindBy(xpath = "//*[text()='UNAPPROVED']")
    public WebElement unapproved;

    @FindBy(xpath = "//*[text()='STAYING']")
    public WebElement staying;

    @FindBy(xpath = "//*[text()='DISCHARGED']")
    public WebElement discharged;

    @FindBy(xpath = "//*[text()='CANCELLED']")
    public WebElement cancelled;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement save;

    @FindBy(xpath = "//*[@class='is-touched is-pristine av-valid form-control']")
    public WebElement anamnesis;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement saveButton;

   @FindBy(xpath = "//*//tbody//tr//td[2]")
    public List<WebElement> nameList;

    @FindBy(xpath = "//tr/th")
    public List<WebElement> InPatients;

    @FindBy(xpath = "(//span[contains(@class, 'd-none')])[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//span[contains(@class, 'd-none')])[3]")
    public WebElement editButtonUnapproved;

    @FindBy(xpath = "//select[contains(@id,'in-patient-room')]")
    public WebElement room;

    @FindBy(xpath = "//select/option[contains(text(),'3661578')]")
    public WebElement room3661578;
    ////select/option[contains(text(),'3661578')]
    ////select/option[contains(text(),'675210')]

    @FindBy(xpath = "//*[text()='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement roomUpdate;



    ////*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']
    //The In Patient is updated with identifier

    //The In Patient is updated with identifier 334583




}
