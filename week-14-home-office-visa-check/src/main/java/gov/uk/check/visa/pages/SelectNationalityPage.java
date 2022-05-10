package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//-nationalityDropDownList, nextStepButton locators and create
//methods 'void selectNationality(String nationality)'
public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver,this);
    }
    //select from droppdown nationality
    @FindBy(xpath = "//select[@id='response']")
    WebElement findNationality;
    public void selectnationalityfromdroppdown(String text){
        Reporter.log("Selecting day"+text+" from dropdown "+findNationality.toString() + "<br>");
        selectByValueFromDropDown(findNationality,text);
    }
   // click on continue
   @FindBy(xpath = "//button[contains(text(),'Continue')]")
   WebElement nextStepButton;
    public void clickoncontinue(){
        Reporter.log("Clicking on next Step Button"+ nextStepButton.toString()+ "<br>");
        clickOnElement(nextStepButton);
    }





}
