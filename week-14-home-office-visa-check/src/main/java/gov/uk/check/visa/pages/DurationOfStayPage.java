package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yesButton;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnCountinu;

    public void clickOnYes() {
        Reporter.log("Clicking on yes Button "+ yesButton.toString()+ "<br>");
        clickOnElement(yesButton);
    }

    public void clickOnCountinu() {
        Reporter.log("Clicking on clickOnCountinu "+ clickOnCountinu.toString()+ "<br>");
        clickOnElement(clickOnCountinu);
    }
    //longer than 6 months
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement longerthen6months;
    public void selectLongerThan6Months(){
        Reporter.log("Clicking on longerthen6months "+ longerthen6months.toString()+ "<br>");
        clickOnElement(longerthen6months);
    }

}
