package com.qa.factory.abstractFactory;

import com.qa.constants.DriverType;

import static com.qa.constants.DriverType.CHROME;
import static com.qa.constants.DriverType.FIREFOX;

public class DriverManagerFactoryAbstract {

    public static DriverManagerAbstract getManager(DriverType driverType){
        switch (driverType){
            case CHROME -> {
                return new ChromeDriverManagerAbstract();
            }
            case FIREFOX -> {
                return new FirefoxDriverManagerAbstract();
            }
            default -> throw new IllegalStateException("Unexpected value: " + driverType);
        }
    }
}
