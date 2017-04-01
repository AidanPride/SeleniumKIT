package thomasCook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ThomasCookMainPage extends ThomasCookAbstractPage{
    @FindBy(how = How.CLASS_NAME, using = "FormField-text FormField-text--iconRight SearchbarForm-inputForm")
    private WebElement searchField;

    @FindBy(how = How.ID , using = "SearchbarForm-goingTo")
    private WebElement destination;

    @FindBy(how = How.ID , using = "when")
    private WebElement date;

    @FindBy(how = How.ID , using = "SearchbarForm-duration")
    private WebElement duration;

    @FindBy(how = How.ID , using = "SearchbarRooms-adults0")
    private WebElement adults;

    @FindBy(how = How.ID , using = "SearchbarRooms-children0")
    private WebElement children;

    @FindBy(how = How.ID , using = "SearchbarForm-submitBtn")
    private WebElement searchButton;

    @FindBy(how = How.ID , using = "PopularTooltip--airports")
    private WebElement airports;


    public ThomasCookMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver , this);
    }

    public void setSearchField(String flyingFrom) {
        WebDriverWait wait = new WebDriverWait(driver ,  30);
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(flyingFrom);
        searchField.submit();


    }

    public void setDestination(String flyingTo) {
        WebDriverWait wait = new WebDriverWait(driver ,  30);
        wait.until(ExpectedConditions.visibilityOf(destination));
        destination.click();
        destination.sendKeys(flyingTo);
        destination.submit();
    }

    public void setDate(WebElement date) {
        this.date = date;
    }

    public void setDuration(String nights) {
        this.duration = duration;
        new Select(duration).selectByValue("string:" + nights);
    }

    public void setAdults(WebElement adults) {
        this.adults = adults;
    }

    public void setChildren(WebElement children) {
        this.children = children;
    }

    public ThomasCookResultPage clickSearchButton() {
        searchButton.click();
        return new ThomasCookResultPage(driver);
    }
}
