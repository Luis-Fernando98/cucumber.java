package selenium;

import org.openqa.selenium.WebDriver;
import pom.Comics;
import pom.Home;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected Home home = new Home (driver);
    protected Comics comics = new Comics(driver);

}
