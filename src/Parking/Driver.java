package Parking;

import Parking.Entity.ParkingLot;
import Parking.Entity.Vehicle;
import Parking.Enum.ParkingSpotType;
import Parking.Strategy.DefaultParkingStrategy;
import Parking.Strategy.ParkingStrategy;

public class Driver {

    public static void main(String args[]) {

        int bikeCount = 3, carCount =2, truckCount = 2;
        ParkingLot parkingLot =  new ParkingLot(bikeCount, carCount, truckCount);

        // Think what are you going to implement in the given timeframe

        // 1. We want to have a parking Lot
        // 2. We need to have parking Spots
        // 3. We would have different vehicles and we need to park them
        // 4. Need to check if we have space available
        // 5. Release the vehicle


        // 6. Ticket Generation
        // 7. Teriff Calcuation
        // 8. Doing Payment and going


        // Entry Gate
        // process -> Check if you have available spots
        //             If we get Parking Spot
        //             TicketGeneration()
        //              ParkVehicle()



        // Exit Gate
        // Process ->   releaseSpot()
        //              teriffCalculation()
        //              PayAmount()


        Vehicle bike = new Vehicle("KA531010", ParkingSpotType.BIKE);
        Vehicle bike2 = new Vehicle("KA531111", ParkingSpotType.BIKE);
        Vehicle bike3 = new Vehicle("KA532222", ParkingSpotType.BIKE);
        Vehicle bike4 = new Vehicle("KA533333", ParkingSpotType.BIKE);
        Vehicle bike5 = new Vehicle("KA534444", ParkingSpotType.BIKE);


        Vehicle c1 = new Vehicle("KA535555", ParkingSpotType.CAR);
        Vehicle c2 = new Vehicle("KA536666", ParkingSpotType.CAR);
        Vehicle c3 = new Vehicle("KA537777", ParkingSpotType.CAR);


        ParkingStrategy defaultStrategy =  new DefaultParkingStrategy();

        parkingLot.parkVehicle(bike, defaultStrategy);
        parkingLot.parkVehicle(bike2, defaultStrategy);

        parkingLot.parkVehicle(bike3, defaultStrategy);
        parkingLot.parkVehicle(bike4, defaultStrategy);
        parkingLot.releaseSpot(bike);
        

    }
}
