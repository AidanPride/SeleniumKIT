import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class WikiFindAppleTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws  Exception{
        System.setProperty("webdriver.gecko.driver" , "F:\\JavaWorkSpace\\SeleniumKIT\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org");
    }

    @Test
    public void findApple(){
       WebElement element =  driver.findElement(By.cssSelector("#searchInput"));
       element.sendKeys("Apple");
       element.submit();

       element = driver.findElement(By.cssSelector(".fn.org"));

        Assert.assertEquals(element.getText().contains("Apple Inc.") , true);

    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
}
