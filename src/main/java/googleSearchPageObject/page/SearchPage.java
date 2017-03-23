package googleSearchPageObject.page;

import googleSearchPageObject.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPage extends WebDriverTestBase{

    @Test
    public void searchTest(){
        driver.get("https://www.google.com.ua");

        WebElement searchElement = driver.findElement(By.id("gs_htif0"));
        searchElement.sendKeys("Selenium");
        searchElement.submit();

        WebElement findElement = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/h3/a"));
        Assert.assertEquals(findElement.getText().contains("Selenium") , true);

    }
}
