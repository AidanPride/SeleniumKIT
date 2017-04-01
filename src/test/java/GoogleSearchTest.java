
import googleSearchPageObject.core.WebDriverTestBase;
import googleSearchPageObject.page.ResultPage;
import googleSearchPageObject.page.SearchPage;
import googleSearchPageObject.utils.DataProviderGoogle;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class GoogleSearchTest extends WebDriverTestBase{


    @Test(dataProviderClass = DataProviderGoogle.class,
          dataProvider = "dataProvider")
    public void searchTest(String url , String text){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.open(url);
        ResultPage resultPage = searchPage.searchText(text);
        Assert.assertTrue(resultPage.getFirstLink().getText().contains(text));

    }


}
