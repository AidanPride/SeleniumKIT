
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckCurrency {
    WebDriver driver;

    @BeforeSuite
    public void setUp() throws Exception{
        System.setProperty("webdriver.gecko.driver" , "F:\\JavaWorkSpace\\SeleniumKIT\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30L , TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://finance.i.ua");
    }

    @Test
    public void checkSumm(){
        List<String> expectedResult = new ArrayList<String>();
        expectedResult.add("134 439.33");
        expectedResult.add("4 650.30");
        expectedResult.add("286 425.42");

        List<String> actualResult = new ArrayList<String>();

        driver.findElement(By.id("currency_amount")).sendKeys("5000");
        new Select(driver.findElement(By.xpath(".//*[@id='converter_bank']"))).selectByValue("1");
        List<WebElement> webElements = driver.findElements(By.xpath(".//*[@id='currency_exchange']"));
        webElements.remove(1);

        for (WebElement webElement: webElements) {
            actualResult.add(webElement.getAttribute("value"));
        }


        for (int i=0; i < expectedResult.size(); i++) {
            Assert.assertEquals(actualResult.get(i), expectedResult.get(i));
        }
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
}
