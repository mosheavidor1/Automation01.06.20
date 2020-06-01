package Pages.NEP;

import Pages.GenericPage;
import WebElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//Clicks on commit button
    public class ClickOnCommitPage extends GenericPage {



        public static final By CommitClick = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-cbox/twa-collapse/div[1]/div/div[3]/twa-button/material-button/div/div");

        @FindBy(how = How.XPATH, using = "/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-cbox/twa-collapse/div[1]/div/div[3]/twa-button/material-button/div/div")

        public WebElement Commit_click;

        public void  clickOnCommit() {


            Button Click_commit = new Button(Commit_click);

            Click_commit.element.click();


        }
    }


