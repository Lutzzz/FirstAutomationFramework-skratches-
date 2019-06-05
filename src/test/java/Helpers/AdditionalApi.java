package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AdditionalApi {

    protected WebDriver driver;
    protected WebDriverWait waiter;

    public abstract WebDriver getWebDriver();

    protected void open(String url) {
        getWebDriver().get(url);
    }

    public WebElement getByCss(String selector) {
        return getWebDriver().findElement(By.cssSelector(selector));
    }

    public WebElement getByLoc(By locator) {
        return getWebDriver().findElement(locator);
    }

}
