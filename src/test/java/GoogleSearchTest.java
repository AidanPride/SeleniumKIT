import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class GoogleSearchTest {
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.gecko.driver" , "F:\\JavaWorkSpace\\SeleniumKIT\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua");
    }

    @Test
    public void searchTest(){
        WebElement searchElement = driver.findElement(By.id("gs_htif0"));
        searchElement.sendKeys("Selenium");
        searchElement.submit();

        WebElement findElement = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/h3/a"));
        Assert.assertEquals(findElement.getText().contains("Selenium") , true);

    }

    @After
    public void down(){
        driver.quit();
    }
}
