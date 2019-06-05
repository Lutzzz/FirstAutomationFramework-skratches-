package Helpers;

import org.junit.After;
import org.openqa.selenium.WebDriver;



public class BaseTest extends AdditionalApi {


    public WebDriver getWebDriver() {
        return driver;
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
