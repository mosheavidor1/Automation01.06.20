package Pages.NEP;

import Pages.GenericPage;
import WebElements.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.security.Key;


//Click on the Search customer

public class ClickOnTheSearchedCustomer extends GenericPage {




    public static final By ClickOnSelected = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-datagrid/twa-datalist/div[1]/dlmain/twa-datalist-table/div/twa-datalist-column[4]/div/twa-datalist-format/dynamic-component/entity-customer-column/div/div");

    @FindBy(how = How.XPATH, using = "/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-datagrid/twa-datalist/div[1]/dlmain/twa-datalist-table/div/twa-datalist-column[4]/div/twa-datalist-format/dynamic-component/entity-customer-column/div/div")

    public WebElement Selected_click;

    public void ClickOnSelected() {


        Button Click_OnSelected = new Button(Selected_click);

        Click_OnSelected.element.click();


    }

//Click on configuration icon
    public static final By ClickOnCustomerConfigurationIcon = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-datagrid/twa-datalist/twa-action-bar/div/div[2]/div[1]/div/twa-action-bar-item/twa-button[1]/material-button/div/i");

    @FindBy(how = How.XPATH, using = "/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[4]/div/div[2]/twa-cc-device-section/twa-lazy-view-stack/div/twa-lazy-view[2]/div/twa-cc-entity-search/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-datagrid/twa-datalist/twa-action-bar/div/div[2]/div[1]/div/twa-action-bar-item/twa-button[1]/material-button/div/i")

    public WebElement conf2;

    public void ClickOnConf() {


        Button Click_OnConf = new Button(conf2);

        Click_OnConf.element.click();





    }
}


