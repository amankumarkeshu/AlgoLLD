package Uber_LLD.strategy;

import Uber_LLD.Entity.Location;
import Uber_LLD.Entity.TripMetaData;

public class RatingBasedPricingStrategy implements PricingStrategy {
    @Override
    public int calculatePrice(TripMetaData tripMetaData) {

        Location src = tripMetaData.getSrc();
        Location des = tripMetaData.getDes();

        double x = Math.abs( des.getLatitude() - src.getLatitude() ) * Math.abs( des.getLatitude() - src.getLatitude());
        double y =Math.abs( des.getLongitude() - src.getLongitude() ) * Math.abs( des.getLongitude() - src.getLongitude());
        double dis =  Math.sqrt(x + y );

        System.out.println("distance travalled  = " + dis);
        return (int) dis *  (10 + tripMetaData.getDriverRating());
    }
}
