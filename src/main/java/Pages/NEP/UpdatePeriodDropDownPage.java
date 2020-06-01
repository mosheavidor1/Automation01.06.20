package Pages.NEP;

import Pages.GenericPage;
import WebElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




//check for updates (change the Update period). clicks on the Drop Down


    public class UpdatePeriodDropDownPage extends GenericPage {


        public static final By periodDrop = By.xpath("/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-cc-dynamic-form/twa-form/div[1]/twa-form-row[1]/twa-form-column/twa-form-item[5]/div/div[2]/twa-cc-field/div[1]/twa-cc-select/twa-select-dropdown/select-dropdown-button/div/span[2]");


        @FindBy(how = How.XPATH, using ="/html/body/portal-main/div/div/div[3]/portal-router/div/twa-portal-stage[6]/div/div[2]/twa-nav-menu-stage[5]/div/div[2]/twa-cc-config-section/twa-lazy-view-stack/div/twa-lazy-view[1]/div/twa-cc-config-editor/twa-page/twa-detail-view/twa-detail-view-center/twa-collapse/div[1]/twa-cc-dynamic-form/twa-form/div[1]/twa-form-row[1]/twa-form-column/twa-form-item[5]/div/div[2]/twa-cc-field/div[1]/twa-cc-select/twa-select-dropdown/select-dropdown-button/div/span[2]")

        public WebElement Period_Drop;




        public void  PeriodDrop() {
            Button PeriodD = new Button(Period_Drop);

            PeriodD.element.click();


        }


        //check for updates (change the Update period). clicks on the selected period
        public static final By ChoosePeriod = By.xpath("/html/body/div/div[46]/div/div/div/div[2]/div/div[2]/div/material-list/div/div[4]/twa-select-dropdown-item/span");




        @FindBy(how = How.XPATH, using = "/html/body/div/div[46]/div/div/div/div[2]/div/div[2]/div/material-list/div/div[4]/twa-select-dropdown-item/span")


        private WebElement Period_choose;


        public void PeriodChoose () {


            Button ChooseThisPeriod = new Button(Period_choose);

            ChooseThisPeriod.element.click();







        }


    }








