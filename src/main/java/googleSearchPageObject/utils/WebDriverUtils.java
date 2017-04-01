package googleSearchPageObject.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
    WebDriverWait wait;

    public WebDriverUtils(WebDriver driver) {
        wait = new WebDriverWait(driver , 40);
    }

    public void waitForExpextedCondition(ExpectedCondition expectedCondition){
        wait.until(expectedCondition);
    }
}
