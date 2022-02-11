package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindows {

    public WebDriver driver;
    public WebDriverWait wait;

    public BrowserWindows(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement newTabButton () {
        return driver.findElement(By.id("tabButton"));
    }

    public WebElement newWindowButton () {
        return driver.findElement(By.id("windowButton"));
    }

    public WebElement newWindowMessage () {
        return driver.findElement(By.id("messageWindowButton"));
    }

    public void clickOnButton (WebElement we) {
        we.click();
    }

    public void nextTab () {
        String parentWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()){
            if (!parentWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
