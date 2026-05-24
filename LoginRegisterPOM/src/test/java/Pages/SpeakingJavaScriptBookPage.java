package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpeakingJavaScriptBookPage extends BaseTest {

    public SpeakingJavaScriptBookPage(WebDriver driver) {
        PageFactory.initElements(BaseTest.driver, this);
    }

@FindBy (css = ".text-right.fullButton")
    public WebElement addBookButton;

    //--------------------------------

    public void clickOnAddBookButton(){
        addBookButton.click();
    }
}
