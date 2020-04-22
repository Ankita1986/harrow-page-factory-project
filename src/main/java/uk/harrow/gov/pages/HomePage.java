package uk.harrow.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.harrow.gov.utility.Utility;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



    @FindBy(xpath = "//span[contains(text(),'Coronavirus (COVID-19)')]")
    WebElement covid19Link;

    public void clickOnCovid19Link(){
        Reporter.log("Clicking On Covid19 Link" + covid19Link.toString() + "<br>" );
        clickOnElement(covid19Link);
        log.info("Clicking On Covid19 Link" + covid19Link.toString());
    }


}
