package Uber_LLD.manager;

import Uber_LLD.Entity.*;
import Uber_LLD.strategy.DriverMatchingStrategy;
import Uber_LLD.strategy.PricingStrategy;
import Uber_LLD.strategy.StrategyManager;

import java.util.HashMap;

public class TripManager {

    RiderManager riderManager;
    DriverManager driverManager;

    HashMap<Integer, Trip> tripsInfo;

    HashMap<Integer, TripMetaData> tripMetaDataInfo;
    public static TripManager tripManagerInstance;

    public static TripManager getInstance() {
        if (tripManagerInstance == null) {
            tripManagerInstance =  new TripManager();
        }
        return tripManagerInstance;
    }

    public HashMap<Integer, Trip> getTripsInfo() {
        return tripsInfo;
    }

    public HashMap<Integer, TripMetaData> getTripMetaDataInfo() {
        return tripMetaDataInfo;
    }

    private TripManager() {
        this.tripsInfo = new HashMap<>();
        this.tripMetaDataInfo = new HashMap<>();
    }


    public void createTrip(Rider rider, Location src, Location des) {

        TripMetaData metaData = new TripMetaData(rider.getRating(), src, des);
        StrategyManager strategyMgr = StrategyManager.getInstance();
        PricingStrategy pricingStrategy = strategyMgr.determinePricingStrategy(metaData);
        DriverMatchingStrategy driverMatchingStrategy = strategyMgr.determineMatchingStrategy(metaData);

        Driver driver = driverMatchingStrategy.matchDriver(metaData);
        if (driver == null) {
            System.out.print("This trip cannot be created. No drivers found");
            return;
        }
        int tripPrice = pricingStrategy.calculatePrice(metaData);

        int tripId = tripsInfo.size();
        Trip trip = new Trip(rider, driver, src, des, tripPrice, pricingStrategy, driverMatchingStrategy);
        trip.setTripId(tripId);
        tripsInfo.put(tripId, trip);
        tripMetaDataInfo.put(tripId, metaData);

    }
}
