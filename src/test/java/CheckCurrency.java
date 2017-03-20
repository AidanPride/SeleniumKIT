import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 20.03.2017.
 */
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
        String expectedResult = "134 546.32";
        driver.findElement(By.id("currency_amount")).sendKeys("5000");
        new Select(driver.findElement(By.xpath(".//*[@id='converter_bank']"))).selectByValue("1");
        String actualResults = driver.findElement(By.id("UAH")).findElement(By.xpath(".//*[@id='currency_exchange']")).getAttribute("value");
        Assert.assertEquals(actualResults, expectedResult);

    }

//    @AfterClass
//    public void tearDown() throws Exception{
//        driver.quit();
//    }
}
