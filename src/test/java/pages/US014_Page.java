package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US014_Page {
    public US014_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement myPages;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-bed fa-w-20 fa-fw ']")
    public WebElement myInpatients;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement edit;

    @FindBy(xpath = "(//div/label")
    public WebElement editPatient;
}
