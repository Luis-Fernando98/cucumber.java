package runner.manager;

import java.sql.DriverManager;

public class driverManagerFactory {
    public static DriverManager getManager(drivertype type){
        drivermanager driverManager = null;
        switch (type){
            case CHROME:
                driverManager = new chromedrivermanager();
                break;
            case FIREFOX:
                driverManager = new FireFoxmanager();
                break;
                default:
                    System.out.println("Invalid browser selected");
                    break;
        }
        return driverManager;



    }
}
