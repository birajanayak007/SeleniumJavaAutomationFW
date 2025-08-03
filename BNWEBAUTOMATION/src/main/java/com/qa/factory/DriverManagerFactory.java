package com.qa.factory;

import com.qa.constants.DriverType;

import static com.qa.constants.DriverType.CHROME;
import static com.qa.constants.DriverType.FIREFOX;

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
