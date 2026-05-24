package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage extends BaseTest {

    WebDriver driver;
    WebElement logoutButton;
    WebElement loggedInMessage;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.linkText("Logout"));
    }

    public WebElement getLoggedInMessage() {
        return driver.findElement(By.id("flash"));
    }

    //-------------------------
    public String messageLoggedIn() {
        return getLoggedInMessage().getText();
    }
}
