package googleSearchPageObject.core;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class WebDriverTestBase {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception{
        System.setProperty("webdriver.gecko.driver" ,
                WebDriverTestBase.class.getClassLoader().getResource("geckodriver.exe").getPath());
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}
