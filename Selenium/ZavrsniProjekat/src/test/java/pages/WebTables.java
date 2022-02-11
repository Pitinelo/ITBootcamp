package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {

    public WebDriver driver;
    public WebDriverWait wait;

    public WebTables(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement addTableButton () {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public void addTableButtonClick () {
        addTableButton().click();
    }

    public WebElement fullNamePopUp () {
        return driver.findElement(By.id("firstName"));
    }

    public void fullNamePopUpFill (String s) {
        fullNamePopUp().sendKeys(s);
    }

    public WebElement lastNamePopIp () {
        return driver.findElement(By.id("lastName"));
    }

    public void lastNamePopUpFill (String s) {
        lastNamePopIp().sendKeys(s);
    }

    public WebElement emailPopUp () {
        return driver.findElement(By.id("userEmail"));
    }

    public void emailFill (String s) {
        emailPopUp().sendKeys(s);
    }

    public WebElement age () {
        return driver.findElement(By.id("age"));
    }

    public void ageFill (int i) {
        age().sendKeys(String.valueOf(i));
    }

    public WebElement salary () {
        return driver.findElement(By.id("salary"));
    }

    public void salaryFill (int i) {
        salary().sendKeys(String.valueOf(i));
    }

    public WebElement department () {
        return driver.findElement(By.id("department"));
    }

    public void departmentFill (String s) {
        department().sendKeys(s);
    }

    public WebElement submitButton () {
        return driver.findElement(By.id("submit"));
    }

    public void submitButtonCLick () {
        submitButton().click();
    }

    public WebElement wholeTableList () {
        return driver.findElement(By.className("rt-tbody"));
    }

    public WebElement deleteButton () {
        return driver.findElement(By.className("action-buttons")).findElement(By.cssSelector("[title=\"Delete\"]"));
    }

    public void deleteButtonClick () {
        deleteButton().click();
    }

}
