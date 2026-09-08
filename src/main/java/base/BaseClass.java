package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ConfigReader;

import java.util.Properties;

public class BaseClass {
    WebDriver driver;

    public WebDriver setUp() {
        ConfigReader reader= new ConfigReader();
        String urlOpen =  reader.getPropertyValue("url");
        System.out.println("Url is..1" + urlOpen);
        System.out.println("Url is..2" + urlOpen);
        System.out.println("Url is..3" + urlOpen);
        String maven_bro = System.getProperty("browser");
        if (driver == null) {

            ChromeOptions options = new ChromeOptions();
          //  options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
            /*WebDriver driver = new ChromeDriver(options);*/

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.get(urlOpen);
            driver.manage().window().maximize();
        }
        return driver;
    }

}
