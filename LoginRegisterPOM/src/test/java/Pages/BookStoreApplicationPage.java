package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreApplicationPage extends BaseTest {

    public BookStoreApplicationPage(WebDriver driver) {
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy (id = "login")
    public  WebElement getLogInButton;

    //-----------------------------------

    public void clickOnLogInButton(){
        getLogInButton.click();
    }
}
