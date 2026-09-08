package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {

    WebDriver driver;
    public OfferPage(WebDriver driver){
       this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search-field']")
    public WebElement sentItem;

    @FindBy(xpath = "//a[text()='Top Deals']")
    public WebElement clickTopDeals;

    @FindBy(css = "tbody tr td:nth-child(1)")
    public WebElement getProductName;

    public void clickTopDealLink(){
        clickTopDeals.click();
    }

    public String sentItem(String name){
        sentItem.sendKeys(name);
        return name;
    }

    public String verifyProductName(){
        return getProductName.getText();
    }

}
