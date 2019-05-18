package FIRSTPACK.TestBase;

import FIRSTPACK.APIclasses.AdditionalApi;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest extends AdditionalApi {

    private static WebDriverWait waiter;
    protected static WebDriver driver;


    public static void setWebDriver(int browserId, int implicitWait ) {
        switch (browserId) {
            case 1:
                driver = new InternetExplorerDriver();
                break;
            case 2:
                driver = new FirefoxDriver();
                break;
            case 3:
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    //@After
    public void tearDown () {
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }
}
