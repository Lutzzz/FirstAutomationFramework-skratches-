package FIRSTPACK.BasePage;

import FIRSTPACK.APIclasses.AdditionalApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends AdditionalApi {


    private WebDriver driver;


    public BasePage(WebDriver driver) {  // В конструктор страницы мы передаем полученный выше драйвер и после этого иницициализируем элементы страницы с помощью PageFactory.
        this.driver = driver;
    }


    public WebDriver getWebDriver() {
        return null;
    }
}
