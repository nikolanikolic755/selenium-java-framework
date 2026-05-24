package Base;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

public class BaseTest {

   public WebDriver driver;
  public WebDriverWait wait;
  public LoginPage loginPage;
  public ExcelReader excelReader;

  @BeforeClass
    public void setUp() throws IOException {
      WebDriverManager.chromedriver().setup();
    excelReader = new ExcelReader("C:\\Users\\DD\\Downloads\\users.xlsx");
  }
}

