package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTablesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver=new ChromeDriver();
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        loginPage=new LoginPage(driver);

    }

    @Test (priority = 1)
    public void loginValidCredentials(){

        String validUsername= excelReader.getStringData("Sheet1",1,0);
        String validPassword= excelReader.getStringData("Sheet1",1,1);

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickLogin();

    }
}
