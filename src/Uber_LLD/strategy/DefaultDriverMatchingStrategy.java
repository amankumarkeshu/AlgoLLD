package Uber_LLD.strategy;

import Uber_LLD.Entity.Driver;
import Uber_LLD.Entity.TripMetaData;
import Uber_LLD.manager.DriverManager;

public class DefaultDriverMatchingStrategy implements DriverMatchingStrategy{
    @Override
    public Driver matchDriver(TripMetaData tripMetaData) {
        DriverManager driverMgr = DriverManager.getInstance();

        if (driverMgr.getDriverHashMap().isEmpty()) {
            System.out.println("There are 0 drivers! What service is this, huh?");
            return null;
        }

        System.out.println("Using quadtree to see nearest cabs, using driver manager to get details of drivers and send notifications");

        for(Driver driver : driverMgr.getDriverHashMap().values()) {
            if (driver.isAvailable()) {
                System.out.println("Driver is available");
                System.out.println("Setting " + driver.getName() + " as driver");
                driver.setAvailable(false);
                tripMetaData.setDriverRating(driver.getRating());
                driverMgr.getDriverHashMap().put(driver.getName(), driver);
                return driver;
            }

        }
        System.out.println("No drivers available! What service is this, huh?");
        return null;

    }
}
