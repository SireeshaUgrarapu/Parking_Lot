package ProjectParkingLot.service.strategy.spotAllocationStrategy;

import ProjectParkingLot.models.ParkingLot;
import ProjectParkingLot.models.ParkingSpot;
import ProjectParkingLot.models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(ParkingLot parkingLot,Vehicle vehicle);
}
