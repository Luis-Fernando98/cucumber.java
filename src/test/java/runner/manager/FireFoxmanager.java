package runner.manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;

public class FireFoxmanager extends drivermanager {
    @Override
    public void createDriver(){
        System.setProperty("webdriver.gecko.driver","./src/test/resources/FirefoxDriver/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

    }


}
