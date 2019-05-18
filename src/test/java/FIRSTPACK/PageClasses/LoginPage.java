package FIRSTPACK.PageClasses;

import FIRSTPACK.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //
    public final static String url = "http://10.81.2.195:8080";
    public static final String pass = "Admin123";
    public static final String login = "direktor";
    // Locators
    public static final By loginField = By.cssSelector("#app > div.AppLoader__root > div > div.flex.mt-16 > form > div:nth-child(1) > div > div.vm-input__main > input");
    public static final By passField = By.cssSelector("#app > div.AppLoader__root > div > div.flex.mt-16 > form > div:nth-child(2) > div > div.vm-input__main > input");
    public static final By submitField = By.cssSelector("[type=\"submit\"]");







    public LoginPage(WebDriver driver) {
        super(driver);
    }
}


