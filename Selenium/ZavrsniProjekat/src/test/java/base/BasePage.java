package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.io.IOException;
import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public ExcelReader excelReader;
    public String homeURL;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public TextBox textBox;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public WebTables webTables;
    public Buttons buttons;
    public Links links;
    public BrokenLinks brokenLinks;
    public DownloadAndUpload downloadAndUpload;
    public DynamicProperties dynamicProperties;
    public Forms forms;
    public AlertsFramesAndWindows alertsFramesAndWindows;
    public BrowserWindows browserWindows;





    @BeforeClass
    public void setup () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage(driver,wait);
        elementsPage = new ElementsPage(driver,wait);
        excelReader = new ExcelReader("ProjekatFajl.xlsx");
        homeURL = excelReader.getStringData("URL", 0, 1);
        textBox = new TextBox(driver,wait);
        checkBox = new CheckBox(driver,wait);
        radioButton = new RadioButton(driver,wait);
        webTables = new WebTables(driver,wait);
        buttons = new Buttons(driver,wait);
        links = new Links(driver,wait);
        brokenLinks = new BrokenLinks(driver,wait);
        downloadAndUpload = new DownloadAndUpload(driver,wait);
        dynamicProperties = new DynamicProperties(driver,wait);
        forms = new Forms(driver,wait);
        alertsFramesAndWindows = new AlertsFramesAndWindows(driver,wait);
        browserWindows = new BrowserWindows(driver,wait);
    }

    public void scrollMethod (WebElement we) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we);

    }

    public String expectedMessageForPartialExcel (String sheet, String whichWordToPass, int untilWhichROw){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= untilWhichROw; i++){
            if (excelReader.getStringData(sheet, i, 1).equals(whichWordToPass)) {
            }
            else if (i == untilWhichROw){
                sb.append(excelReader.getStringData(sheet, i, 1));
            }else {
                sb.append(excelReader.getStringData(sheet, i, 1)).append("\n");
            }

        }

        return sb.toString();
    }

    public String expectedMessageForWholeExcelRow (String sheet){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= excelReader.lastRow(sheet); i++){
            if (i == excelReader.lastRow(sheet)){
                sb.append(excelReader.getStringData(sheet, i, 1));
            }else {
                sb.append(excelReader.getStringData(sheet, i, 1)).append("\n");
            }

        }

        return sb.toString();
    }

    @AfterClass
    public void tearDown () {
      //  driver.manage().deleteAllCookies();
        //driver.close();
      //  driver.quit();
    }
}
