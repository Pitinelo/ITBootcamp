package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RadioButton {

    public WebDriver driver;
    public WebDriverWait wait;

    public RadioButton(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List<WebElement> radioButtons () {
        return driver.findElements(By.className("custom-control-label"));
    }


    public WebElement yesRadioButton () {
        return radioButtons().get(0);

    }

    public void yesRadioButtonClick () {
        yesRadioButton().click();
    }


    public WebElement impressiveRadioButton () {
        return radioButtons().get(1);
    }

    public void impressiveRadioButtonClick () {
        impressiveRadioButton().click();
    }

    public WebElement noRadioButton () {
        return radioButtons().get(2);
    }

    public void noRadioButtonClick () {
        noRadioButton().click();
    }

    public WebElement radioButtonMessage () {
        return driver.findElement(By.className("mt-3"));
    }
}
