package Pages;

import Helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public static final String url = "https://online.mkb.ru/";
    private static final String pass = "Admin123";
    private static final String login = "direktor";

    @FindBy(css = "#app > div.AppLoader__root > div > div.flex.mt-16 > form > div:nth-child(1) > div > div.vm-input__main > input")
    private WebElement loginField;
    @FindBy(css = "#app > div.AppLoader__root > div > div.flex.mt-16 > form > div:nth-child(2) > div > div.vm-input__main > input")
    private WebElement passField;
    @FindBy(css = "[type=\"submit\"]")
    private WebElement submitButton;


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void doLogin() {
        loginField.sendKeys(login);
        passField.sendKeys(pass);
        (new WebDriverWait(driver, 4)).until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    public void checkLogin () {
        MainPage page = new MainPage(driver);
        page.checkSuccessfulLogin();
    }
}


