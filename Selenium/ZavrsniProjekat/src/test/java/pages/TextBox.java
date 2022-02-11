package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TextBox {

    public WebDriver driver;
    public WebDriverWait wait;

    public TextBox(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement fullNameField () {
        return driver.findElement(By.id("userName"));
    }

    public void fullNameFieldFill (String s) {
        fullNameField().clear();
        fullNameField().sendKeys(s);
    }

    public WebElement emailField () {
        return driver.findElement(By.id("userEmail"));
    }

    public void emailFieldFill (String s) {
        emailField().sendKeys(s);
    }

    public WebElement currentAddressField () {
        return driver.findElement(By.id("currentAddress"));
    }

    public void currentAddressFieldFill (String s) {
        currentAddressField().sendKeys(s);
    }

    public WebElement permanentAddressField () {
        return driver.findElement(By.id("permanentAddress"));
    }

    public void permanentAddressFieldFill (String s) {
        permanentAddressField().sendKeys(s);
    }

    public WebElement submitButton () {
        return driver.findElement(By.id("submit"));
    }

    public void submitButtonClick () {
        submitButton().click();
    }

    public List<WebElement> messages () {
        return driver.findElements(By.cssSelector(".border.col-md-12.col-sm-12"));
    }

    public WebElement nameMessage () {
        return messages().get(0);
    }
}
