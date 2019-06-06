package Tests;

import Helpers.BaseTest;
import Pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static Pages.LoginPage.*;



public class FirstTest extends BaseTest {

    @Before
    public void setup() {
        driver = new ChromeDriver();
        open(url);
    }


    @Test
    public void firstTest() {
        LoginPage page = new LoginPage(driver);
        page.doLogin();
        page.checkSuccess();
    }
}