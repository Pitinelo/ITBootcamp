package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AlertsTab {

    public WebDriver driver;
    public WebDriverWait wait;

    public AlertsTab(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List <WebElement> clickMeButtons () {
        return driver.findElements(By.cssSelector(".btn.btn-primary"));
    }

    public void clickOnRightButton (int i) {
        clickMeButtons().get(i).click();

    }

    public WebElement alertConfirmMessage () {
        return driver.findElement(By.id("confirmResult"));
    }

    public WebElement alertPromptMessage () {
        return driver.findElement(By.id("promptResult"));
    }
}
