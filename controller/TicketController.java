package ProjectParkingLot.controller;

import ProjectParkingLot.exception.InvalidRequestException;
import ProjectParkingLot.models.Ticket;
import ProjectParkingLot.models.Vehicle;
import ProjectParkingLot.service.strategy.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        if(gateId <= 0 || parkingLotId <= 0){
            throw new InvalidRequestException("Please enter valid request");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
