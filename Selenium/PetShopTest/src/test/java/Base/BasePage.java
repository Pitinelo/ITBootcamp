package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    // initilazing all pages that I have created in this test, WebDriver, WebDriverWait, Class for reading excel and homeURL string
    public WebDriver driver;
    public WebDriverWait wait;
    public ExcelReader excelReader;
    public HomePage homePage;
    public SignInPage signInPage;
    public SignUpPage signUpPage;
    public String homeURL;
    public MyAccountPage myAccountPage;
    public BirdsPage birdsPage;


    @BeforeClass
    public void setup () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("F:\\Programiranje\\itbootcamp\\PetShop.xlsx");
        homePage = new HomePage(driver,wait);
        signInPage = new SignInPage(driver,wait);
        signUpPage = new SignUpPage(driver,wait);
        homeURL = excelReader.getStringData("URL", 0, 1);
        myAccountPage = new MyAccountPage(driver,wait);
        birdsPage = new BirdsPage(driver,wait);

    }
    // After running a whole class this method close tab and whole chrome Browser, and clear cookies
    @AfterClass
    public void tearDown () {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

}
