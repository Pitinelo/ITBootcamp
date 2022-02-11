package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

    public WebDriver driver;
    public WebDriverWait wait;

    public DynamicProperties(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement enableAfterButton () {
        return driver.findElement(By.id("enableAfter"));
    }

    public WebElement colorChange () {
        return driver.findElement(By.id("colorChange"));
    }

    public WebElement visibleAfter () {
        return driver.findElement(By.id("visibleAfter"));
    }






}
