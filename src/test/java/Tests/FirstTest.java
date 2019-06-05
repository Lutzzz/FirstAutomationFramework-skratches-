package Tests;


import Helpers.BaseTest;
import Pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Pages.LoginPage.*;

public class FirstTest extends BaseTest {

    @Before
    public void setup() {
        driver = new ChromeDriver();
        waiter = new WebDriverWait(driver, 4);
        open(url);
    }


    @Test
    public void firstTest() {
        LoginPage page = new LoginPage(driver);
        page.doLogin();
    }
}