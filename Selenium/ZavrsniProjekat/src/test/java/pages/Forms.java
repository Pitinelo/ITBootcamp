package pages;

import jdk.jshell.spi.ExecutionControl;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class Forms {


    public WebDriver driver;
    public WebDriverWait wait;



    public Forms(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public List<WebElement> formsTabs () {
        return driver.findElements(By.cssSelector(".btn.btn-light "));
    }

    public void chooseAndClickFormsTab (String s) {
        for (int i = 0; i < formsTabs().size(); i++) {
            if (formsTabs().get(i).getText().equals(s)){
                formsTabs().get(i).click();
                break;
            }
        }
    }

    public WebElement firstNameField () {
        return driver.findElement(By.id("firstName"));
    }

    public void firstNameFill (String s) {
        firstNameField().clear();
        firstNameField().sendKeys(s);
    }

    public WebElement lastNameField () {
        return driver.findElement(By.id("lastName"));
    }

    public void lastNameFill (String s) {
        lastNameField().clear();
        lastNameField().sendKeys(s);
    }

    public WebElement emailField () {
        return driver.findElement(By.id("userEmail"));
    }

    public void emailNameFill (String s) {
        emailField().clear();
        emailField().sendKeys(s);
    }

    public List <WebElement> hobbieButtons () {
        return driver.findElement(By.id("hobbiesWrapper")).findElements(By.className("custom-control-label"));
    }

    public List <WebElement> radioButtons () {
        return driver.findElement(By.id("genterWrapper")).findElements(By.className("custom-control-label"));
    }

    public void clickOnMaleRadioButton (int i) {
        radioButtons().get(i).click();
    }

    public void clickOnSportsHobbie (int i) {
        hobbieButtons().get(i).click();
    }

    public WebElement mobileNumberField () {
        return driver.findElement(By.id("userNumber"));
    }

    public void mobileNumberFieldFill (String s) {
        mobileNumberField().sendKeys(s.substring(1));
    }

    public WebElement birthDateField () {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    public WebElement birthDateMonth () {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }

    public WebElement birthDateYear () {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }

    public List <WebElement> birthDateDayWeekend (int i) {
        return driver.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day--0" + i + ".react-datepicker__day--weekend"));
    }

    public List <WebElement> birthDateDayWorkWeek (int i) {
        return driver.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day--0" + i));
    }



    public void chooseBirthDate (String s, int i, int j) {
        birthDateField().click();
        birthDateMonth().sendKeys(s);
        birthDateMonth().sendKeys(ENTER);
        birthDateYear().sendKeys(String.valueOf(i));
        birthDateYear().sendKeys(ENTER);

        if (birthDateDayWeekend(j).size() == 1){
            birthDateDayWeekend(j).get(0).click();
        }else {
            birthDateDayWorkWeek(j).get(0).click();
        }

    }

    public WebElement subjectField () {
        return driver.findElement(By.xpath("//input[@id='subjectsInput']"));
    }

    public void subjectFieldFill (String s) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",subjectField());
        subjectField().sendKeys(s);
        subjectField().sendKeys(Keys.TAB);


    }

    public WebElement uplaodPhotoButton () {
        return driver.findElement(By.id("uploadPicture"));
    }

    public void uploadPhoto (String s) {
        uplaodPhotoButton().sendKeys(s);
    }

    public WebElement currentAddressField () {
        return driver.findElement(By.id("currentAddress"));
    }

    public void currentAddressFill (String s) {
        currentAddressField().sendKeys(s);
    }

    public WebElement selectStateField () {
        return driver.findElement(By.id("state"));
    }

    public void selectState () {
        selectStateField().click();
        Actions enterButton = new Actions(driver);
        enterButton.sendKeys(Keys.chord(ENTER)).perform();
    }

    public WebElement selectCityField () {
        return driver.findElement(By.id("city"));
    }

    public void selectCity () {
        selectCityField().click();
        Actions enterButton = new Actions(driver);
        enterButton.sendKeys((Keys.chord(ENTER))).perform();
    }

    public WebElement submitBUtton () {
        return driver.findElement(By.id("submit"));
    }

    public void clickOnSubmitButton () {
        submitBUtton().click();
    }

    public WebElement inputData () {
        return driver.findElement(By.cssSelector(".table.table-dark.table-striped.table-bordered.table-hover"));
    }












}
