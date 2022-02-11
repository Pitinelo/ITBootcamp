package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBox {

    public WebDriver driver;
    public WebDriverWait wait;

    public CheckBox(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement plusBUtton () {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
    }

    public void plusButtonCLick () {
        plusBUtton().click();
    }

    public List<WebElement> treeList (){
        return driver.findElements(By.cssSelector(".rct-title"));
    }

    public void clickOnFieldInTree (String s) {
        for (int i = 0; i < treeList().size(); i++) {
            if (treeList().get(i).getText().equals(s)) {
                treeList().get(i).click();
                break;
            }
        }
    }



    public WebElement message () {
        return driver.findElement(By.id("result"));
    }
}
