package Pages.NEP;

import Pages.GenericPage;
import WebElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CustomerIDSearch extends GenericPage {


//Type the customer ID in the search box


    public static final By TypeCustomerID = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-form/div[1]/twa-form-row/twa-form-column[1]/twa-form-item[1]/div/div[2]/div/twa-input/div/material-input/div/div[1]/label/input");


    @FindBy(how = How.XPATH, using = "/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-form/div[1]/twa-form-row/twa-form-column[1]/twa-form-item[1]/div/div[2]/div/twa-input/div/material-input/div/div[1]/label/input")

    private WebElement ID_Type;

    public TextBox ID;


    public CustomerIDSearch() {
        ID = new TextBox(ID_Type);


    }


}




