package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AlertsFramesAndWindows {

    public WebDriver driver;
    public WebDriverWait wait;

    public AlertsFramesAndWindows(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List<WebElement> alertsTabs() {
        return driver.findElements(By.cssSelector(".btn.btn-light "));
    }

    public void chooseAndClickAlertsTab(String s) {
        for (int i = 0; i < alertsTabs().size(); i++) {
            if (alertsTabs().get(i).getText().equals(s)) {
                alertsTabs().get(i).click();
                break;
            }
        }
    }
}
