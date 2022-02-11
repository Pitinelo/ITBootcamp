package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //creating list of tabs on main page
    public List<WebElement> fields() {
        return driver.findElements(By.cssSelector(".card-body"));
    }

    public void chooseAndClickOnElementsTab (String s) {
        for (int i = 0; i < fields().size(); i++) {
            if (fields().get(i).getText().equals(s)){
                fields().get(i).click();
                break;
            }
        }
    }

    //getting every webelement on the main page by its place in previously created List
    public WebElement homePageTabs (String s) {

        for (int i = 0; i < fields().size(); i++) {
            if (fields().get(i).getText().equals(s)){
              WebElement  proba = fields().get(i);
              return proba;

            }
            }
        WebElement proba = fields().get(fields().size());
        return proba;
        }


    public boolean imaLiElemenata(String s) {
        boolean elementi = false;
        for (int i = 0; i < fields().size(); i++) {
            if (fields().get(i).getText().equals(s)) {
                elementi = true;
                break;
            }

        }
        return elementi;
    }

}
