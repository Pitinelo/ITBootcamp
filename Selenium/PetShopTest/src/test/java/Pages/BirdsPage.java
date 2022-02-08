package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BirdsPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BirdsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    // making method that locate heading of this page so we can assert that we are on the right page
    public WebElement birdsHeadline () {
        WebElement catalog = driver.findElement(By.id("Catalog"));
        return catalog.findElement(By.tagName("h2"));
    }


}
