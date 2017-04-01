package googleSearchPageObject.page;

import googleSearchPageObject.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPage extends AbstractPage{

    @FindBy(how = How.ID , using = "gs_htif0")
    private WebElement searchField;

    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver , this);
    }

    public ResultPage searchText(String text){
        searchField.sendKeys(text);
        searchField.submit();
        return new ResultPage(driver);
    }


}
