package thomasCook.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class ThomasCookResultPage extends ThomasCookAbstractPage {
@FindBy(how = How.CLASS_NAME , using = "SrpHeader-title SrpHeader-title--seo")
private WebElement filter;

@FindBy(how = How.ID , using = "SearchbarReadonly-duration")
private WebElement duration;

@FindBy(how = How.ID , using = "SearchbarReadonly-origin")
private WebElement flyingFrom;

@FindBy(how = How.ID , using = "SearchbarReadonly-goingTo")
    private WebElement flyingTo;

    @FindBy(how = How.ID , using = "SearchbarReadonly-value0")
    private WebElement whith;



    public ThomasCookResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver , this);
    }

    public WebElement getFilter() {
        return filter;
    }

    public String getDuration(){

        return  duration.getText();

    }

    public String getFlyingFrom() {
        return flyingFrom.getText();
    }

    public String getFlyingTo() {
        return flyingTo.getText();
    }

    public String getWhith() {
        return whith.getText();
    }
}
