package Pages;

import Helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class MainPage extends BasePage {

    @FindBy(css = "[type=]") private WebElement incomeButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void checkSuccessfulLogin() {
        assertThat(ExpectedConditions.elementToBeClickable(incomeButton));
    }

}
