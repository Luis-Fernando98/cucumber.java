package runner.manager;

import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
public class chromedrivermanager extends drivermanager{
    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
    }
}
