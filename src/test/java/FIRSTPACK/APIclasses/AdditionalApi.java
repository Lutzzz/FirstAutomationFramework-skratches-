package FIRSTPACK.APIclasses;

        import org.openqa.selenium.*;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

        import java.util.List;

public abstract class AdditionalApi {

    public abstract WebDriver getWebDriver(); //асбтрактный метод для получения веб драйвера, он потом будет реализован в наследнике и уже ниже будет использоваться, например в методе Open

    public void open(String url) {
        getWebDriver().get(url);
    }

    public  WebElement getByCss (String selector){
        return getWebDriver().findElement(By.cssSelector(selector));
    }

    public  WebElement getByLoc (By locator) {
        return getWebDriver().findElement(locator);
    }






}
