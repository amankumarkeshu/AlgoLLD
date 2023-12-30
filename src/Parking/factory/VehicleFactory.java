package Parking.factory;

import Parking.Entity.Vehicle;
import Parking.Enum.ParkingSpotType;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehNumber, ParkingSpotType parkingSpotType) {

        return new Vehicle(vehNumber, parkingSpotType);

    }
}
