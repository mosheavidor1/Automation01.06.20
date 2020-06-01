package Pages.NEP;

import Pages.GenericPage;
import WebElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//Clicks on the Agent tab on the customer configuration screen
public class ClickOnAgentPage extends GenericPage {



    public static final By AgentClick = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-detail-view/twa-detail-view-left/twa-collapse/div[1]/div/twa-cc-summary/div/div[3]/div[1]/twa-cc-link-chain/div/div/twa-linkbutton/a/div/div/span");

    @FindBy(how = How.XPATH, using = "/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-detail-view/twa-detail-view-left/twa-collapse/div[1]/div/twa-cc-summary/div/div[3]/div[1]/twa-cc-link-chain/div/div/twa-linkbutton/a/div/div/span")

    public WebElement Agent_click;

    public void clickOnAgent() {


        Button Click_OnAgent = new Button(Agent_click);

        Click_OnAgent.element.click();


    }
}