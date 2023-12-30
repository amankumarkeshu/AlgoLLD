package Parking.Entity;

import Parking.Enum.ParkingSpotType;

public abstract class ParkingSpot {
    int parkingSpotId;
    ParkingSpotType parkingSpotType;
    boolean isOccupied;

    public ParkingSpot(int parkingSpotId, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
        this.isOccupied = false;
    }




    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public abstract ParkingSpotType getParkingSpotType();
}
