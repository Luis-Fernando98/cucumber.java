package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Comics extends BasePage{

    private By pageTitleLocator = By.className("wp-block-query-title");
    private String titlePage = "category: comics";

    public Comics (WebDriver driver){
        super(driver);

    }

    public isTitleComicsDisplayed() throws Exception {
        this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);

    }
}
