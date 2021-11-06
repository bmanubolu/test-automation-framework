package coreUtilities;

import coreUtilities.driverManager.ChromeDriverManager;
import coreUtilities.driverManager.DriverManager;
import coreUtilities.driverManager.FirefoxDriverManager;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType driverType){
        switch (driverType){
            case CHROME -> {
                return new ChromeDriverManager();
            }
            case FIREFOX -> {
                return new FirefoxDriverManager();
            }
            default -> throw new IllegalStateException("Unexpected value: " + driverType);
        }
    }
}
