package Parking.Strategy;

import Parking.Entity.ParkingSpot;
import Parking.Entity.Vehicle;

import java.util.List;

public class DefaultParkingStrategy implements  ParkingStrategy {

    @Override
    public ParkingSpot getParkingSpot(Vehicle vehicle, List<ParkingSpot> parkingSpotList) {

        for (int index  = 0; index < parkingSpotList.size(); index++ ) {
            ParkingSpot currentParkingSpot = parkingSpotList.get(index);

            if (!currentParkingSpot.isOccupied() && currentParkingSpot.getParkingSpotType().equals(vehicle.getParkingSpotType())) {
                return currentParkingSpot;
            }
        }
        return null;

    }
}
