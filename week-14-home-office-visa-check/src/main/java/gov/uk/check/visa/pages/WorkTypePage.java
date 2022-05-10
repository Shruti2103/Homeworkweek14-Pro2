package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthandcareprofessional;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement digitaltechnologyprofessional;
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicorresearcher;
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement workinartsorculture;
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement professionalsportsperson;
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousworker;
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement iwanttostartabusiness;
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement iwanttodoanothertypeofjobshowmeotherworkvisas;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnCountinu;

    public void selectJobType(String job) {
        switch (job) {
            case "Health and care professional":
                Reporter.log("Clicking on health and careprofessional "+ healthandcareprofessional.toString()+ "<br>");
                clickOnElement(healthandcareprofessional);
                break;
            case "Digital technology professional":
                Reporter.log("Clicking on digital technology professional"+ digitaltechnologyprofessional.toString()+ "<br>");
                clickOnElement(digitaltechnologyprofessional);
                break;
            case "Academic or researcher":
                Reporter.log("Clicking on academic or researcher "+ academicorresearcher.toString()+ "<br>");
                clickOnElement(academicorresearcher);
                break;
            case "Work in arts or culture":
                Reporter.log("Clicking on work in artsor culture "+ workinartsorculture.toString()+ "<br>");
                clickOnElement(workinartsorculture);
                break;
            case "Professional sports person":
                Reporter.log("Clicking on professional sports person "+ professionalsportsperson.toString()+ "<br>");
                clickOnElement(professionalsportsperson);
                break;
            case "Religious worker":
                Reporter.log("Clicking on religious worker "+ religiousworker.toString()+ "<br>");
                clickOnElement(religiousworker);
                break;
            case "Iwantto start business":
                Reporter.log("Clicking on i want to do another type of jobs howme other work visas"+ iwanttodoanothertypeofjobshowmeotherworkvisas.toString()+ "<br>");
                clickOnElement(iwanttodoanothertypeofjobshowmeotherworkvisas);
                break;
            case "Iwanttodoanothertypeofjobshowmeotherworkvisas":
                Reporter.log("Clicking on i want to do another type of job show me other work visas"+ iwanttodoanothertypeofjobshowmeotherworkvisas.toString()+ "<br>");
                clickOnElement(iwanttodoanothertypeofjobshowmeotherworkvisas);
                break;
        }

    }

    public void clickoncountinu() {
        Reporter.log("Clicking on click On Countinu "+ clickOnCountinu.toString()+ "<br>");
        clickOnElement(clickOnCountinu);
    }


}
