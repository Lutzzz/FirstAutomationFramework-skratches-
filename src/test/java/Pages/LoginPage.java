package Pages;

import Helpers.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class LoginPage extends BasePage {

    public static final String url = "http://10.81.2.187:8080/";
    private static final String pass = "Admin123";
    private static final String login = "direktor";


    @FindBy(xpath = "//input[@type='text']")
    private WebElement loginField;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passField;
    @FindBy(css = "[type=\"submit\"]")
    private WebElement submitButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void doLogin() {
        assertThat(ExpectedConditions.visibilityOf(loginField));
        loginField.sendKeys(login);
        passField.sendKeys(pass);
        assertThat(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.sendKeys(Keys.ENTER);
    }

    public void checkSuccess() {
        MainPage page = new MainPage(driver);
        page.checkSuccessfulLogin();
    }
}


