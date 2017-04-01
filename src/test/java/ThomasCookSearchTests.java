import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import thomasCook.core.ThomasWebDriverTestBase;
import thomasCook.pages.ThomasCookMainPage;
import thomasCook.pages.ThomasCookResultPage;

public class ThomasCookSearchTests extends ThomasWebDriverTestBase {
    private String url = "https://www.thomascook.com/";
    private String flyingFrom = "Any London";
    private String destionation = "New York, USA";
    private String nights = "7";


    @Test
    public void searchButtonTest(){
        ThomasCookMainPage thomasCookMainPage= new ThomasCookMainPage(driver);
        thomasCookMainPage.open(url);
        ThomasCookResultPage thomasCookResultPage = thomasCookMainPage.clickSearchButton();
        Assert.assertNotNull(thomasCookResultPage.getFilter());


    }

    @Test
    public void searchWithDurationTest(){
        ThomasCookMainPage thomasCookMainPage= new ThomasCookMainPage(driver);
        thomasCookMainPage.open(url);
        thomasCookMainPage.setDuration(nights);
        ThomasCookResultPage thomasCookResultPage = thomasCookMainPage.clickSearchButton();

    }
}
