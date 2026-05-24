package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BaseTest {

    public LogInPage(WebDriver driver) {
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy (id = "userName")
    public WebElement getUserNameField;

    @FindBy (id = "password")
   public WebElement getPasswordField;

    @FindBy (id = "login")
    public  WebElement getLogInButton;

    //--------------------------------------------

    public void inputUsername(){
        getUserNameField.clear();
        getUserNameField.sendKeys("nnikolic");
    }
    public void inputPassword(){
   getPasswordField.clear();
        getPasswordField.sendKeys("nikolA5!");
    }
    public void clickOnLogIn(){
        getLogInButton.click();
    }
}
