package googleSearchPageObject.page;

import googleSearchPageObject.utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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

    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver ,  30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
