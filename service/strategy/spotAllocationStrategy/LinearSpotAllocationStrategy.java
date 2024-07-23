package ProjectParkingLot.service.strategy.spotAllocationStrategy;

import ProjectParkingLot.exception.ParkingSpotNotFoundVehicleException;
import ProjectParkingLot.models.ParkingFloor;
import ProjectParkingLot.models.ParkingLot;
import ProjectParkingLot.models.ParkingSpot;
import ProjectParkingLot.models.Vehicle;
import ProjectParkingLot.models.enums.ParkingSpotStatus;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        for(ParkingFloor parkingFloor: parkingFloors){
            for(ParkingSpot parkingSpot :parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                        parkingSpot.getVehicleType().equals(vehicle.getVehicleType()))
                {
                    return parkingSpot;

                }
            }
        }
        throw new ParkingSpotNotFoundVehicleException("Please go hom, eat and sleep");
    }
}
