package utils;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

public class TestContextSetUp {
    public String landingPageProductname;
    public PageObjectManager pageObjectManager;
    public WebDriver driver;
    public GenericClass genericClass;
    public BaseClass baseClass;

    public TestContextSetUp() {
        baseClass = new BaseClass();
        driver = baseClass.setUp();
        pageObjectManager = new PageObjectManager(driver);
        genericClass = new GenericClass(driver);
    }

    public PageObjectManager getPageObjectManager(){
        return pageObjectManager;
    }

}
