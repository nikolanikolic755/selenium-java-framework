package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends BaseTest {

    public BookStorePage(WebDriver driver) {
        PageFactory.initElements(BaseTest.driver, this);
    }

    @FindBy(linkText = "Speaking JavaScript")
    public WebElement speakingJavaScriptBook;

    //--------------------

    public void clickOnSpeakingJavaSriptBook(){
        speakingJavaScriptBook.click();
    }
}
