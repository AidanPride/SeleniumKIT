package thomasCook.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThomasCookUtils {
    WebDriverWait wait;

    public ThomasCookUtils(WebDriver driver) {
        wait = new WebDriverWait(driver , 40);
    }

    public void waitForExpectedCondition(ExpectedCondition expectedCondition){
        wait.until(expectedCondition);
    }
}
