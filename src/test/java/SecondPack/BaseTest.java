package SecondPack;



import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver wd;

    public WebDriver getWd(){
        return this.wd;
}

    @After
    public void tearDown() throws Exception {
        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
    }







}
