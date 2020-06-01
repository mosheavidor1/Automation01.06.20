package Pages.NEP;

import Pages.GenericPage;
import WebElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//Click on Publish button
    public class ClickOnPublishPage extends GenericPage {



        public static final By PublishClick = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-cbox/twa-collapse/div[1]/div/div[3]/twa-button/material-button/div/div");

        @FindBy(how = How.XPATH, using = "/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-cbox/twa-collapse/div[1]/div/div[3]/twa-button/material-button/div/div")

        public WebElement Publish_Click;

        public void  ClickPublish() {


            Button PubClick = new Button(Publish_Click);

            PubClick.element.click();


        }
    }




