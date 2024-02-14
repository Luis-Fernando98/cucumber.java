package selenium;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.manager.driverManagerFactory;
import runner.manager.drivertype;

import java.sql.DriverManager;

public class Hooks {
    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;
    @Before

    public void setup(){
        numberOfCase ++;
        System.out.println("se esta ejecutando el escenario nro:" + numberOfCase);
        driverManager = driverManagerFactory.getManager(drivertype.CHROME);
        driver =driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("el scenario nro: " + numberOfCase + "se ejecuto correctamente.");
        driverManager.quitDriver();
    }
    public static WebDriver getDriver(){
    return driver;

    }

}
