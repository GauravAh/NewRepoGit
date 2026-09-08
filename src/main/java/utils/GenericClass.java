package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class GenericClass {

    private WebDriver driver;
    private String parentWindow;

    public GenericClass(WebDriver driver) {
        this.driver = driver;
        // Store parent window when GenericClass is created
        this.parentWindow = driver.getWindowHandle();
    }

    public void switchToChildWindow() {
        Set<String> allWindows = driver.getWindowHandles();
        for (String childWindow : allWindows) {
            if (!childWindow.equals(parentWindow)) {
                driver.switchTo().window(childWindow);
                System.out.println("Parent Window : " + parentWindow);
                System.out.println("Child Window  : " + childWindow);
                // Validate parent and child are different
                if (!parentWindow.equals(childWindow)) {
                    System.out.println("Successfully switched to Child Window");
                }
                break;
            }
        }
    }
}
