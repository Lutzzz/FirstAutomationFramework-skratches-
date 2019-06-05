package Pages;

import Helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {


    @FindBy(css = "[type=\"submit\"]") private WebElement incomeButton;




    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void checkSuccessfulLogin() {
        (new WebDriverWait(driver, 7)).until(ExpectedConditions.elementToBeClickable(incomeButton));
    }

}
