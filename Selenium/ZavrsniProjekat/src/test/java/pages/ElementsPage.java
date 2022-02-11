package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsPage {

    public WebDriver driver;
    public WebDriverWait wait;


    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List<WebElement> elementsTabs() {
        return driver.findElements(By.cssSelector(".btn.btn-light "));
    }

    public void chooseAndClickElementsTab(String s) {
        for (int i = 0; i < elementsTabs().size(); i++) {
            if (elementsTabs().get(i).getText().equals(s)) {
                elementsTabs().get(i).click();
                break;
            }
        }
    }
}