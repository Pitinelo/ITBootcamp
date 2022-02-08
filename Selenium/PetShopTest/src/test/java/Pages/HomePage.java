package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    //creating all elements from HomePage that I need for this test
    public WebElement signInButton () {
        return driver.findElement(By.linkText("Sign In"));
    }

    public WebElement signOutButton () {
        return driver.findElement(By.linkText("Sign Out"));
    }

    public WebElement myAccountButton () {
        return driver.findElement(By.linkText("My Account"));
    }

    // I had to use xPath to find these elements because there was not a better method on this site i tight timeline during test
    public WebElement parrot () {
        return driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[1]"));
    }

    public WebElement fish () {
        return driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]"));
    }

    public WebElement dog () {
        return driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[3]"));
    }

    public WebElement reptile () {
        return driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[4]"));
    }

    public WebElement cat () {
        return driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[5]"));
    }

    public WebElement birds () {
        return driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[6]"));
    }


    //making methods which functionality is to click on created elements
    public void clickOnSignInButton () {
        signInButton().click();
    }



    public void clickMyAccount () {
        myAccountButton().click();
    }



    public void clickParrot () {
        parrot().click();
    }


    //This method was not used because I didn't have time to make test for this funcionalities
    public void clickFish () {
        fish().click();
    }



    public void clickDog () {
        dog().click();
    }



    public void clickReptile () {
        reptile().click();
    }



    public void clickCat () {
        cat().click();
    }



    public void clickBirds () {
        birds().click();
    }










}
