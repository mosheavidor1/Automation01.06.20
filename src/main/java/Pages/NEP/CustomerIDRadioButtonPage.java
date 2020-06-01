package Pages.NEP;

import Pages.GenericPage;
import WebElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomerIDRadioButtonPage extends GenericPage {

//Clicks on customer ID radio button

    public static final By IDRadioButton = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-form/div[1]/twa-form-row/twa-form-column[1]/twa-form-item[1]/div/div[2]/div/div/twa-radiobutton[2]/div[1]/span/i");

    @FindBy(how = How.XPATH, using = "/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-form/div[1]/twa-form-row/twa-form-column[1]/twa-form-item[1]/div/div[2]/div/div/twa-radiobutton[2]/div[1]/span/i")

    public WebElement RadioB_click;

    public void clickOnB() {


        Button Click_OnB = new Button(RadioB_click);

        Click_OnB.element.click();


    }
}
