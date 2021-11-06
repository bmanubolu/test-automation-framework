package coreUtilities;


import coreUtilities.driverManager.DriverManager;
import org.openqa.selenium.WebDriver;

public class coreHelper {

    private final ThreadLocal<DriverManager> driverManager = new ThreadLocal<>();
    private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private void setDriverManager(DriverManager driverManager){
        this.driverManager.set(driverManager);
    }

    protected DriverManager getDriverManager(){
        return this.driverManager.get();
    }

    private void setDriver(WebDriver driver){
        this.driver.set(driver);
    }

    protected WebDriver getDriver(){
        return this.driver.get();
    }

}

