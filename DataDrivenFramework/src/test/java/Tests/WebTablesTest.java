package Tests;

import Base.BaseTest;
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

    }

    @Test (priority = 1)
    public void test1(){

    }
}
