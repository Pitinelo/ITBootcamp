package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BrokenLinks {

    public WebDriver driver;
    public WebDriverWait wait;

    public BrokenLinks(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement textLinksParentPath () {
        return driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6"));
    }

    public List <WebElement> textLinks () {
        return textLinksParentPath().findElements(By.tagName("a"));
    }

    public WebElement validLink () {
        return textLinks().get(0);
    }

    public WebElement brokenLink () {
        return textLinks().get(1);
    }

    public void clickOnTextLink (WebElement wa) {
        wa.click();
    }
}
