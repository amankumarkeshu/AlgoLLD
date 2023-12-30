package Parking.Entity;

import Parking.Enum.ParkingSpotType;
import Parking.Strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingLot {

    List<ParkingSpot> parkingSpotList;
    HashMap<Vehicle, ParkingSpot> vehicleParkingSpotMap;


    public ParkingLot(int bikeCount, int carCount, int truckCount) {
        parkingSpotList = new ArrayList<>();
        vehicleParkingSpotMap = new HashMap<>();
        int parkingId = 1;

        for ( int index = 0; index < bikeCount ; index++ )  {
            ParkingSpot spot = new BikeParkingSpot(parkingId++, ParkingSpotType.BIKE);
            parkingSpotList.add(spot);
        }

        for ( int index = 0; index < carCount ; index++ )  {
            ParkingSpot spot = new CarParkingSpot(parkingId++, ParkingSpotType.CAR);
            parkingSpotList.add(spot);
        }

        for ( int index = 0; index < truckCount ; index++ )  {
            ParkingSpot spot = new TruckParkingSpot(parkingId++, ParkingSpotType.TRUCK);
            parkingSpotList.add(spot);
        }

    }


    public boolean parkVehicle(Vehicle vehicle, ParkingStrategy parkingStrategy) {


        ParkingSpot parkingSpot = parkingStrategy.getParkingSpot(vehicle, parkingSpotList);
        if(parkingSpot == null) {
            System.out.println(" No parking available for the vehicle with number" + vehicle.getVehNumber() + " and type " + vehicle.getParkingSpotType());
            return false;
        }

        parkingSpot.setOccupied(true);
        updateParkingList(parkingSpot);
        vehicleParkingSpotMap.put(vehicle, parkingSpot);

        System.out.println("Parked Successfully. Vehicle with number" + vehicle.getVehNumber() + " and type " + vehicle.getParkingSpotType());
        return true;
    }


    private void updateParkingList(ParkingSpot parkingSpot) {
        for(int index = 0; index < parkingSpotList.size(); index++) {
            if (parkingSpot.getParkingSpotId() == parkingSpotList.get(index).getParkingSpotId()) {
                System.out.println("Updated parking spot.");
                parkingSpotList.set(index, parkingSpot);
            }
        }
    }

    public void releaseSpot(Vehicle vehicle) {

        if (vehicleParkingSpotMap.containsKey(vehicle)) {
            ParkingSpot parkingSpot = vehicleParkingSpotMap.get(vehicle);
            parkingSpot.setOccupied(false);
            updateParkingList(parkingSpot);
            vehicleParkingSpotMap.remove(vehicle);
            System.out.println(" Parking Spot successfully release.");

        } else{
            System.out.println(" Parking Spot not release as Vehicle not found in the parking spot.");
        }

    }


}
