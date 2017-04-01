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

@FindBy(how = How.ID , using = "SearchbarForm-duration")
private Select durations;



    public ThomasCookResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver , this);
    }

    public WebElement getFilter() {
        return filter;
    }

    public String getSelectedParam(){
        WebDriverWait wait = new WebDriverWait(driver , 30);
        wait.until(ExpectedConditions.visibilityOf(filter));
       List<WebElement> options = durations.getOptions();
        for (WebElement element: options) {
            if (element.isSelected()){
                return element.getText();
            }
        }

        return   "nothing";

    }


}
