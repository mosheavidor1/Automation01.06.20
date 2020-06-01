package Tests.NEP;

import Actions.NepActions;
import Tests.GenericTest;
import Utils.PropertiesFile.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.io.IOException;


public class ChangeUpdatedIntervals extends GenericTest {


    private NepActions action;

    @Factory(dataProvider = "getData")
    public ChangeUpdatedIntervals(Object dataToSet) {
        super(dataToSet);
        action = new NepActions();

    }


    @Test

    //How often to check for updates.
    public void UpdatePeriod() throws Exception {


        action.LaunchApplication(data.get("Browser"));
        action.SetApplicationUrl(PropertiesFile.getCurrentClusterLink());

        action.Login(PropertiesFile.getUserName(), PropertiesFile.getPassword());

        action.GotoCentComSearch(PropertiesFile.getCurrentClusterLink());

        action.ClickOnIDRadioButton();

        SetCustomerID();

        ClickOnSearch();

        ClickOnCustomer();

        ClickOnAgentTab();

        UpdatePeriodTime();

        ReportPeriodConfig();

        CommitClickConf();

        PublishClickConf();

        ContinueButtonConf();


    }

    //Clicks on customer ID radio button
    public void ClickOnIDRadioButton() throws Exception {

        action.ClickOnIDRadioButton();


    }

    //Type the customer ID in the search box

    public void SetCustomerID() throws Exception {


        action.TypeCustomerID(data.get("CustomerID"));


    }


    public void ClickOnSearch() throws Exception {

        action.ClickOnSearchButton();

    }


    //Click On the selected customer + click on configuration icon
    public void ClickOnCustomer() throws Exception {


        action.ClickOnTheCustomer();


    }


    //Clicks on the Agent tab on the customer configuration screen
    public void ClickOnAgentTab() throws Exception{

        action.ClickOnAgentTab();

    }

    //check for updates (change the Update period).

    public void UpdatePeriodTime() throws IOException, InterruptedException {



        action.UpdatePeriodConf();
    }




    //Clicks and change the Report period  (How often to send data.)
    public void ReportPeriodConfig() throws IOException, InterruptedException {



        action.ReportPeriodConf();

    }

    //Clicks on commit button
    public void CommitClickConf() throws IOException, InterruptedException{

        Thread.sleep(5000);

        action.ClickOnCommit();
    }



    //Click on Publish button

    public void PublishClickConf() throws IOException, InterruptedException{

        Thread.sleep(5000);

        action.ClickOnPublish();
    }




    //Click on continue button

    public void ContinueButtonConf() throws IOException, InterruptedException{

Thread.sleep(5000);

        action.ClickOnContinue();
    }




//
//    @AfterMethod
//    public void Close() throws Exception {
//        afterMethod();
//        action.CloseApplication();
//
//    }


}



