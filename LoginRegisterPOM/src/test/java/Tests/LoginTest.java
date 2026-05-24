package Tests;

import Base.BaseTest;
import Pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://demoqa.com/");

        homePage = new HomePage(driver);
        bookStoreApplicationPage = new BookStoreApplicationPage(driver);
        logInPage = new LogInPage(driver);
        profilePage = new ProfilePage(driver);
        bookStorePage = new BookStorePage(driver);
        speakingJavaScriptBookPage = new SpeakingJavaScriptBookPage(driver);
    }

    @Test(priority = 1)
    public void logIn() {
        homePage.clickOnBookStoreApplication();
        bookStoreApplicationPage.clickOnLogInButton();
        logInPage.inputUsername();
        logInPage.inputPassword();
        logInPage.clickOnLogIn();


        Assert.assertTrue(profilePage.getLogOutButton.isDisplayed());
        Assert.assertTrue(profilePage.getUserNameLogged.getText().contains("nnikolic"));

        profilePage.clickOnBookStore();
        bookStorePage.clickOnSpeakingJavaSriptBook();
        speakingJavaScriptBookPage.clickOnAddBookButton();

    }


}
