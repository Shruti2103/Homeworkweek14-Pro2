package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//- nextStepButton, reasonForVisitList locators and create methods
//'void selectReasonForVisit(String reason)'
//and 'void clickNextStepButton()
public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    // Tourism
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement travelReason;


    //Work, academic visit or business
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAccedemicReason;

    public void clickonWorkAcademicReason() {
        Reporter.log("Clicking on work Accedemic Reason "+ workAccedemicReason.toString()+ "<br>");
        clickOnElement(workAccedemicReason);
    }


    //Join partner or family for a long stay'
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartnerReason;

    public void clickonjoinPartnerReason() {
        Reporter.log("Clicking on join Partner Reason "+ joinPartnerReason.toString()+ "<br>");
        clickOnElement(joinPartnerReason);
    }

    // click on continue
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void clickoncontinuebutton() {
        Reporter.log("Clicking on continue Button "+ continueButton.toString()+ "<br>");
        clickOnElement(continueButton);
    }

    public void selectReasonforVisit(String reason) {
      if (reason=="Tourist"){
          clickOnElement(travelReason);
          Reporter.log("Clicking on travel Reason "+ travelReason.toString()+ "<br>");
      }
       if(reason=="Workacademicvisitorbusiness"){
           clickOnElement(workAccedemicReason);
           Reporter.log("Clicking on work Accedemic Reason"+ workAccedemicReason.toString()+ "<br>");
       }
        if(reason=="Joinpartnerorfamilyforalongstay"){
            Reporter.log("Clicking on join PartnerReason "+ joinPartnerReason.toString()+ "<br>");
            clickOnElement(joinPartnerReason);

        }


    }
}