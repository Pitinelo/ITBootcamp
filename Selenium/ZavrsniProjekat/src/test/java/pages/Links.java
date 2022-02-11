package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Links {

    public WebDriver driver;
    public WebDriverWait wait;

    public Links(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement simpleLink () {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement dynamicLink () {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement createdLink () {
        return driver.findElement(By.id("created"));
    }

    public WebElement noContentLink () {
        return driver.findElement(By.id("no-content"));
    }

    public WebElement movedLink () {
        return driver.findElement(By.id("moved"));
    }

    public WebElement badRequestLin () {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement unauthorizedLink () {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement forbiddenLink () {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement invalidURLLink () {
        return driver.findElement(By.id("invalid-url"));
    }

    public void clickOnLink (WebElement wa) {
        wa.click();
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

    public List <WebElement> apiLinks () {
        List <WebElement> apiLinks = new ArrayList<>();
        apiLinks.add(createdLink());
        apiLinks.add(noContentLink());
        apiLinks.add(movedLink());
        apiLinks.add(badRequestLin());
        apiLinks.add(unauthorizedLink());
        apiLinks.add(forbiddenLink());
        apiLinks.add(invalidURLLink());
        return apiLinks;
    }



    public WebElement linkResponse () {
        return driver.findElement(By.id("linkResponse"));
    }
}
