package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

// startNowButton locatores and create method 'void clickStartNow()'
public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);

    }
    //accept cookies
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;
    public void clickonacceptcookies(){
        Reporter.log("Clicking on accept Cookies "+ acceptCookies.toString()+ "<br>");
        clickOnElement(acceptCookies);
    }
    // click on start now
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startButton;
    public void clickonStartnow(){
        Reporter.log("Clicking on start Button "+ startButton.toString()+ "<br>");
        clickOnElement(startButton);
    }


}
