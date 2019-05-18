package FIRSTPACK.TestClasses;


import FIRSTPACK.PageClasses.LoginPage;
import FIRSTPACK.TestBase.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static FIRSTPACK.TestBase.BaseTest.setWebDriver;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class FirstTest extends BaseTest {

    @Test
    public void firstTest(){
        setWebDriver(3,0);
        LoginPage page = new LoginPage(getWebDriver());
        open(LoginPage.url);

        $(page.getByLoc(LoginPage.passField)).
    }
}