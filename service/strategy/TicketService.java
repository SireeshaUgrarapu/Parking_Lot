package ProjectParkingLot.service.strategy;

import ProjectParkingLot.models.ParkingLot;
import ProjectParkingLot.models.ParkingSpot;
import ProjectParkingLot.models.Ticket;
import ProjectParkingLot.models.Vehicle;
import ProjectParkingLot.models.enums.ParkingSpotStatus;
import ProjectParkingLot.repository.GateRepository;
import ProjectParkingLot.repository.ParkingLotRepository;
import ProjectParkingLot.repository.ParkingSpotRepository;
import ProjectParkingLot.repository.TicketRepository;
import ProjectParkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategy;
import ProjectParkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private GateRepository gateRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public TicketService() {
    }
    public Ticket generateTicket(Vehicle vehicle,int gateId,int parkingLotId){
        SpotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);

        ParkingSpot allocatedSpot = strategy.getSpotForVehicle(parkingLot, vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.put(allocatedSpot);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntrygate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }

}
