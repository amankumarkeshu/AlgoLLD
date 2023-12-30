package Parking.Entity;

import Parking.Enum.ParkingSpotType;

public class Vehicle {
    String vehNumber;

    ParkingSpotType parkingSpotType;

    public String getVehNumber() {
        return vehNumber;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public Vehicle(String vehNumber, ParkingSpotType parkingSpotType) {
        this.vehNumber = vehNumber;
        this.parkingSpotType = parkingSpotType;
    }

}
