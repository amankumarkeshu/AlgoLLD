package Parking.Entity;

import Parking.Enum.ParkingSpotType;

public class TruckParkingSpot extends  ParkingSpot{

    public TruckParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        super(parkingSpotId, parkingSpotType);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.TRUCK;
    }


}
