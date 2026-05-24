package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy(linkText = "Book Store Application")
    public WebElement getBookStoreApplication;

    //--------------------------------

    public void clickOnBookStoreApplication(){
        getBookStoreApplication.click();
    }
}
