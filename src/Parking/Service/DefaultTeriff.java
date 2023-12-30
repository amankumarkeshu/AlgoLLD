package Parking.Service;

import Parking.Entity.Ticket;

import java.util.Date;

public class DefaultTeriff implements TeriffCalculator {
    @Override
    public int calculatePrice(Ticket ticket) {
        Date date = new Date();

        int durationInhours   =  (date - ticket.getInTime() )) * ;
        return price;
    }
}
