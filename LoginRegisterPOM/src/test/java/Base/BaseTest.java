package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public BookStoreApplicationPage bookStoreApplicationPage;
    public LogInPage logInPage;
    public ProfilePage profilePage;
    public BookStorePage bookStorePage;
    public SpeakingJavaScriptBookPage speakingJavaScriptBookPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }


}
