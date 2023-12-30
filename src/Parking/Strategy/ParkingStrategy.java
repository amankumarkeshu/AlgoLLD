package Parking.Strategy;

import Parking.Entity.ParkingSpot;
import Parking.Entity.Vehicle;

import java.util.List;

public interface ParkingStrategy {

    ParkingSpot getParkingSpot(Vehicle vehicle,  List<ParkingSpot> parkingSpotList);
}
