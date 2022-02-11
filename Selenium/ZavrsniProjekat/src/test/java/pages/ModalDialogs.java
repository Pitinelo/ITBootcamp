package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogs {

    public WebDriver driver;
    public WebDriverWait wait;

    public ModalDialogs(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement smallModalButton () {
        return driver.findElement(By.id("showSmallModal"));
    }

    public WebElement largeModalButton () {
        return driver.findElement(By.id("showLargeModal"));
    }

    public WebElement closeSmallModalButton () {
        return driver.findElement(By.id("closeSmallModal"));
    }

    public WebElement closeLargeModalButton () {
        return driver.findElement(By.id("closeLargeModal"));
    }

    public WebElement modalHeader () {
        return driver.findElement(By.cssSelector(".modal-title.h4"));
    }



    public void clickOnButton (WebElement wa) {
        wa.click();
    }




}
