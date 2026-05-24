package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseTest {

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy (id = "submit")
    public WebElement getLogOutButton;

    @FindBy(id="userName-value")
    public  WebElement getUserNameLogged;

    @FindBy(linkText = "Book Store")
    public WebElement bookStore;

    //------------------------
    public void clickOnBookStore(){
        bookStore.click();
    }
}

