package Pages.NEP;

import Pages.GenericPage;
import WebElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;





    //Click on continue button
    public class ClickOnContinuePage extends GenericPage {



        public static final By ContinueCLick = By.xpath("/html/body/div/div[30]/material-dialog/focus-trap/div[2]/div/footer/div/twa-button[1]/material-button/div/div");

        @FindBy(how = How.XPATH, using = "/html/body/div/div[30]/material-dialog/focus-trap/div[2]/div/footer/div/twa-button[1]/material-button/div/div")

        public WebElement Continue_Click;

        public void  ClickContinue() {


            Button contClick = new Button(Continue_Click);

            contClick.element.click();


        }
    }






