package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Objects;

public class Buttons {

    public WebDriver driver;
    public WebDriverWait wait;

    public Buttons(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }



    public WebElement doubleClickMeButton () {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement righClickMeButton () {
        return driver.findElement(By.id("rightClickBtn"));
    }


    public WebElement clickMeButton () {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
    }




    public void doubleClickMeButtonAction () {
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickMeButton()).perform();
    }

    public void rightClickMeButtonAction () {
        Actions action = new Actions(driver);
        action.contextClick(righClickMeButton()).perform();
    }

    public void clickOnButton (WebElement we) {
        we.click();
    }

    public WebElement doubleClickMessage () {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement rightClickMessage () {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement singleClickMessage () {
        return driver.findElement(By.id("dynamicClickMessage"));
    }
}
