package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {


    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);


    }


    @Test(priority = 1)
    public void loginValidCredentials() {

        String validUsername = excelReader.getStringData("Sheet1", 1, 0);
        String validPassword = excelReader.getStringData("Sheet1", 1, 1);

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickLogin();
        Assert.assertTrue(profilePage.getLogoutButton().isDisplayed());
        Assert.assertTrue(profilePage.messageLoggedIn().contains("You logged into a secure area"));
    }

    @Test(priority = 2)
    public void loginValidUsernameInvalidPassword() throws InterruptedException {
        String validUsername = excelReader.getStringData("Sheet1", 1, 0);

        for (int i = 1; i < excelReader.getLastRow("Sheet1"); i++) {

            String invalidPasswords = excelReader.getStringData("Sheet1", i, 3);
            loginPage.inputUsername(validUsername);
            loginPage.inputPassword(invalidPasswords);
            loginPage.clickLogin();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
            Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
            Assert.assertTrue(loginPage.invalidMessage().contains("Your password is invalid"));

        }

    }

    @Test(priority = 3)
    public void loginInvalidUsernameValidPassword() throws InterruptedException {
        String validPassword = excelReader.getStringData("Sheet1", 1, 1);

        for (int i = 1; i < excelReader.getLastRow("Sheet1"); i++) {
            String invalidUsernames = excelReader.getStringData("Sheet1", i, 2);
            loginPage.inputUsername(invalidUsernames);
            loginPage.inputPassword(validPassword);
            loginPage.clickLogin();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
            Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
            Assert.assertTrue(loginPage.invalidMessage().contains("Your username is invalid"));
        }
    }
}
