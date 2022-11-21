package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement edit;

    @FindBy(xpath = "//*[@class='btn btn-success btn-sm']")
    public WebElement requestATest;

    @FindBy(xpath = "//tbody/tr")
    public WebElement testItems;




}
