package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home extends BasePage{
    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By titleComicsLocator = By.className("wp-block-navigation-item__content");



    public Home(WebDriver driver){
        super(driver);
    }

    public boolean homeIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);

    }
    public void clickOnTitleComics() throws Exception {
        this.click(titleComicsLocator);

    }
}
