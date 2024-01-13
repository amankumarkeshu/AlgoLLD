package Uber_LLD.strategy;

import Uber_LLD.Entity.TripMetaData;

public interface PricingStrategy {
    int calculatePrice(TripMetaData tripMetaData);

}
