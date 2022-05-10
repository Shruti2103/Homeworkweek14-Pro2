package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import gov.uk.check.visa.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
    }

    @Test(groups ={"smoke","sanity","regression"} )
    public void anAustralianCominToUKForTourism(){
       startPage.clickonStartnow();
       selectNationalityPage.selectnationalityfromdroppdown("Australia");
       selectNationalityPage.clickoncontinue();
        reasonForTravelPage.selectReasonforVisit("Tourist");
        reasonForTravelPage.clickoncontinuebutton();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");
        reasonForTravelPage.clickoncontinuebutton();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");


    }
    @Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        startPage.clickonStartnow();
        selectNationalityPage.selectnationalityfromdroppdown("Chile");
        selectNationalityPage.clickoncontinue();
        Thread.sleep(1000);
        reasonForTravelPage.selectReasonforVisit("workacademicvisitbusiness");
        reasonForTravelPage.clickoncontinuebutton();
        durationOfStayPage.selectLongerThan6Months();
        durationOfStayPage.clickOnCountinu();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickoncountinu();
        resultPage.confirmResultMessage("You need a visa to work in health and care");

    }

    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
//    Click on start button
//    Select a Nationality 'Colombia'
//    Click on Continue button
//    Select reason 'Join partner or family for a long stay'
//    Click on Continue button
//    Select state My partner of family member have uk immigration status 'yes'
//    Click on Continue button
//    verify result 'You’ll need a visa to join your family or partner in the UK'

        startPage.clickonStartnow();
        selectNationalityPage.selectnationalityfromdroppdown("Colombia");
        selectNationalityPage.clickoncontinue();
        reasonForTravelPage.selectReasonforVisit("joinpartnerorfamilyforalongstay");
        reasonForTravelPage.clickoncontinuebutton();
        familyImmigrationStatusPage.clickOnYes();
        familyImmigrationStatusPage.clickOnCountinu();
        resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");
    }




}
