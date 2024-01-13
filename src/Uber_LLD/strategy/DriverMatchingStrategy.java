package Uber_LLD.strategy;

import Uber_LLD.Entity.Driver;
import Uber_LLD.Entity.TripMetaData;

public interface DriverMatchingStrategy {

    public Driver matchDriver(TripMetaData tripMetaData);
}
