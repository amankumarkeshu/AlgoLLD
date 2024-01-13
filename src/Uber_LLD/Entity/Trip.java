package Uber_LLD.Entity;

import Uber_LLD.Enum.TripStatus;
import Uber_LLD.strategy.DriverMatchingStrategy;
import Uber_LLD.strategy.PricingStrategy;

public class Trip {

    int tripId;


    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    Rider rider;
    Driver driver;
    Location src;
    Location destination;

    TripStatus tripStatus;

    PricingStrategy pricingStrategy;

    DriverMatchingStrategy driverMatchingStrategy;

    int price;

    public Trip(Rider rider, Driver driver, Location src, Location destination, int tripPrice,
                PricingStrategy pricingStrategy, DriverMatchingStrategy driverMatchingStrategy) {
        this.rider = rider;
        this.driver = driver;
        this.src = src;
        this.destination = destination;
        this.tripStatus = TripStatus.DRIVER_ON_THE_WAY;
        this.price = tripPrice;
        this.pricingStrategy = pricingStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public Location getSrc() {
        return src;
    }

    public void setSrc(Location src) {
        this.src = src;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void displayTripDetails() {
        System.out.println();
        System.out.println("Trip id - " + tripId);
        System.out.println("Rider - " + rider.getName());
        System.out.println("Driver - " + driver.getName());
        System.out.println("Price - " + price);
        System.out.println("Locations - " + src.getLatitude() + "," + src.getLongitude() + " and " +
                destination.getLatitude() + "," + destination.getLongitude());

    }
}
