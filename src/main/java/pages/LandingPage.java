package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    By searchBox =  By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
    By getTextXpath = By.xpath("//h4[starts-with(text(),'Tomato')]");
    By getLogo = By.cssSelector("div[class$=greenLogo]");
    By getLogoText = By.cssSelector("div>span[class='redLogo']");

    public String sentItem(String name){
        driver.findElement(searchBox).sendKeys(name);
        return name;
    }

    public String getTextLogo(){
        return driver.findElement(getLogoText).getText();
    }

    public boolean verifyLogo(){
        driver.findElement(getLogo).isDisplayed();
        return true;
    }

    public String getProductText(){
        return driver.findElement(getTextXpath).getText();
    }

}
