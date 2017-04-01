package googleSearchPageObject.page;

import googleSearchPageObject.utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;


public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverUtils webDriverUtils;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(driver);
    }

    public void open(String url){
        driver.get(url);
    }

}
