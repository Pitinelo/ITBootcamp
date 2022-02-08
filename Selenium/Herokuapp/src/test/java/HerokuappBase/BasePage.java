package HerokuappBase;

import HerokuappPages.LoginPage;
import HerokuappPages.LoginPageAnotacije;
import HerokuappPages.LogoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    public WebDriverWait wait;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    public ExcelReader excelReader;
    public String homeURL;
    public LoginPageAnotacije loginPageAnotacije;

    @BeforeClass
    public void setup () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LoginPage(driver,wait);
        logoutPage = new LogoutPage(driver,wait);
        excelReader = new ExcelReader ("F:\\Programiranje\\itbootcamp\\Excel tabele\\excelZaAutomatsko.xlsx");
        homeURL = excelReader.getStringData("URL", 1, 0);
        loginPageAnotacije = new LoginPageAnotacije();
    }

    @AfterClass
    public void tearDown () {
       driver.close();
       driver.quit();
    }
}
