package Test;

import Base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PetShopTestiranje extends BasePage {

    @BeforeMethod
    public void setupPage () {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    @Test (priority = 10)
    public void signUp() {
        //creating strings and integers that we pass to methods that fill filed on signup page
        String userID = excelReader.getStringData("SignUp podaci", 0, 1);
        String password = excelReader.getStringData("SignUp podaci", 1, 1);
        String firstName = excelReader.getStringData("SignUp podaci", 2, 1);
        String lastName = excelReader.getStringData("SignUp podaci", 3, 1);
        String email = excelReader.getStringData("SignUp podaci", 4, 1);
        int phone = excelReader.getIntegerData("SignUp podaci", 5, 1);
        String address1 = excelReader.getStringData("SignUp podaci", 6, 1);
        String city = excelReader.getStringData("SignUp podaci", 7, 1);
        String state = excelReader.getStringData("SignUp podaci", 8, 1);
        int zip = excelReader.getIntegerData("SignUp podaci", 9, 1);
        String country = excelReader.getStringData("SignUp podaci", 10, 1);
        String language = excelReader.getStringData("SignUp podaci", 11, 1);
        String category = excelReader.getStringData("SignUp podaci", 12, 1);



        homePage.clickOnSignInButton(); // clicking on sign in link, because on HomePage we don't have link for registration
        signInPage.clickOnRegisterTextLink(); // Clicking on text link for registration
        //calling all methods and sending them String and integers that we previously created
        signUpPage.fillUsernameField(userID);
        signUpPage.fillNewPasswordField(password);
        signUpPage.fillRepeatPasswordField(password);
        signUpPage.fillFirstNameField(firstName);
        signUpPage.fillLastNameField(lastName);
        signUpPage.fillEmailField(email);
        signUpPage.fillPhoneField(phone);
        signUpPage.fillAddress1(address1);
        signUpPage.fillCityField(city);
        signUpPage.fillStateField(state);
        signUpPage.fillZipField(zip);
        signUpPage.fillCountryField(country);
        signUpPage.chooseLanguage(language);
        signUpPage.chooseFavoriteCategory(category);
        signUpPage.clickSaveNewAccountButton();


        //creating expeectedURL - where we expect site to redirect us after registration (previously testing this manually
        String expectedURL = homeURL;
        // assert that current URL is same as expected
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);



    }



    @Test (priority = 30) // I made this later priority than invalid login because If user login, than there is nos signin button
    public void verifyThatUserCanLoginWithValidCredentials () {
        //creating strings that are same as the ones user have registered
        String username = excelReader.getStringData("Login", 1, 0);
        String pass = excelReader.getStringData("Login", 1, 1);

        homePage.clickOnSignInButton();
        //sending valid username and pass and then clicking on login Button
        signInPage.fillUsernameField(username);
        signInPage.fillPasswordField(pass);
        signInPage.clickLoginButton();
        //creating String for Assert - what is written on sigout Button, expected URL and text on myAccount button
        String expectedSignOutButtonName = "Sign Out";
        String expectedURL = homeURL;
        String expectedMyAccountButtonName = "My Account";



        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
        Assert.assertTrue(homePage.signOutButton().isDisplayed());
        Assert.assertEquals(homePage.signOutButton().getText(), expectedSignOutButtonName);
        Assert.assertEquals(homePage.myAccountButton().getText(), expectedMyAccountButtonName);

    }

    @Test (priority = 20)
    public void verifyThatUserCantLoginWithRightUsernameAndWrongPass () throws InterruptedException {
        //creating String taht matches already registered username
        String username = excelReader.getStringData("Login", 1, 0);
        //going through excel sheet and creating String for password that doesn't match password for registered username
        for (int i = 2; i <= excelReader.lastRow("Login"); i++ ){
            String pass = excelReader.getStringData("Login", i, 1);
            homePage.clickOnSignInButton();
            signInPage.fillUsernameField(username);
            signInPage.fillPasswordField(pass);
            signInPage.clickLoginButton();

            String expectedURL = excelReader.getStringData("URL", 1, 1);
            String expectedMessage = "Invalid username or password. Signon failed.";

            Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
            Assert.assertEquals(signInPage.errorMessage().getText(),expectedMessage);

        }


    }

    @Test (priority = 40)
    public void verifyThatBothBirdPicturesIsClickableAndLinked () {
        //click on Big Parrot picture at the middle of the homePage
        homePage.clickParrot();
        //Create string for expected URL and expected Headline
        String expectedAnimalName = "Birds";
        String expectedURL = excelReader.getStringData("URL", 2, 1);
        //Assert those two with actual headlind and URL
        Assert.assertEquals(birdsPage.birdsHeadline().getText(),expectedAnimalName);
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
        //driver just go back which is homePamge
        driver.navigate().back();
        //This is second link to the same page, bird picture that is smaller and user click on it
        homePage.clickBirds();

        //Calling same asserts like in previous case
        Assert.assertEquals(birdsPage.birdsHeadline().getText(),expectedAnimalName);
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);



    }


}
