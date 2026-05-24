package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseTest {

   public WebDriver driver;

  public WebDriverWait wait;

  @BeforeClass
    public void setUp(){
      WebDriverManager.chromedriver().setup();
  }
}

