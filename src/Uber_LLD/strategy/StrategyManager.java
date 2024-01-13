package Uber_LLD.strategy;

import Uber_LLD.Entity.TripMetaData;

public class StrategyManager {

    public static StrategyManager strategyManagerInstance;
    private StrategyManager() {
    }
    public static StrategyManager getInstance() {
        if (strategyManagerInstance == null ) {
            return new StrategyManager();
        }
        return strategyManagerInstance;
    }

    public DriverMatchingStrategy determineMatchingStrategy(TripMetaData tripMetaData) {

        return new DefaultDriverMatchingStrategy();
    }

    public PricingStrategy determinePricingStrategy(TripMetaData tripMetaData) {

        // Using some API or time we can decide if we want any other type of pricing strategy.
        return new RatingBasedPricingStrategy();
    }


}
