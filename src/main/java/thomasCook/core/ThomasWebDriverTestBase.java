package thomasCook.core;


import googleSearchPageObject.core.WebDriverTestBase;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class ThomasWebDriverTestBase {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception{
        System.setProperty("webdriver.gecko.driver",
                ThomasWebDriverTestBase.class.getClassLoader().getResource("geckodriver.exe").getPath());
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
    }

    @After
    public void tearnDown() throws Exception {
        driver.quit();
    }
}
