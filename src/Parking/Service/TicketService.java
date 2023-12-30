package Parking.Service;

import Parking.Entity.ParkingSpot;
import Parking.Entity.Ticket;

public class TicketService {

    public Ticket generateTicket(String vehNumber, ParkingSpot parkingSpot) {
        new Ticket(vehNumber, parkingSpot);
     }
}
