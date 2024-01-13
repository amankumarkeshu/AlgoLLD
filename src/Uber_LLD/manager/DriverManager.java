package Uber_LLD.manager;

import Uber_LLD.Entity.Driver;

import java.util.HashMap;

public class DriverManager {


    HashMap<String, Driver>  driverHashMap;

    public static DriverManager instance;
    private DriverManager() {
        this.driverHashMap = new HashMap<>();
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public void addDriver(Driver driver) {
        System.out.println("Added Driver " + driver.getName());
        driverHashMap.put(driver.getName(), driver);
    }

    public HashMap<String, Driver> getDriverHashMap() {
        return driverHashMap;
    }
}
