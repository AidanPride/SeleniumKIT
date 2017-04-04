package thomasCook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import thomasCook.utils.ThomasCookUtils;

public abstract class ThomasCookAbstractPage {
    protected WebDriver driver;
    protected ThomasCookUtils thomasCookUtils;

    public ThomasCookAbstractPage(WebDriver driver) {
        this.driver = driver;
        thomasCookUtils = new ThomasCookUtils(this.driver);
    }

    public void open(String url){
        driver.get(url);

    }

    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver ,  30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
