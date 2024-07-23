package ProjectParkingLot.service.strategy;

import ProjectParkingLot.models.Gate;
import ProjectParkingLot.models.ParkingFloor;
import ProjectParkingLot.models.ParkingLot;
import ProjectParkingLot.models.ParkingSpot;
import ProjectParkingLot.models.enums.*;
import ProjectParkingLot.repository.GateRepository;
import ProjectParkingLot.repository.ParkingFloorRepository;
import ProjectParkingLot.repository.ParkingLotRepository;
import ProjectParkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingLotRepository parkingLotRepository;

    public InitialisationService(GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository, ParkingFloorRepository parkingFloorRepository, ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot init(){
        System.out.println("***** Starting Initialisation *****");
//creating parking lot object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress("So and So");
        parkingLot.setCapacity(100);
        parkingLot.setName("Very Famous Lot");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.FOUR_WHEELER,VehicleType.TWO_WHEELER));
//running a loop to create 10 floors for parking
        List<ParkingFloor> floors = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
// creating 10 parking spots
            List<ParkingSpot> spots = new ArrayList<>();
            for(int j = 0; j < 10;j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setNumber((i*100)+j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);

                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(spots);
            //creating entry gate
            Gate entryGate = new Gate();
            entryGate.setId((i*1000)+1);
            entryGate.setNumber(i*100 + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator : " + i +1);
            parkingFloor.setEntryGate(entryGate.getGateType());
            gateRepository.put(entryGate);
//creating exitGate
            Gate exitGate = new Gate();
            exitGate.setId((i*1000)+2);
            exitGate.setNumber(i*100 + 2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator : " +i + 2);

            parkingFloor.setExitGate(exitGate.getGateType());
            gateRepository.put(exitGate);

            floors.add(parkingFloor);//adding floor  to floor list
            parkingFloorRepository.put(parkingFloor);// saving the floor to the repository
        }
        parkingLot.setFloors(floors);//adding floor list to the parking lot
        parkingLotRepository.put(parkingLot);
       return parkingLotRepository.get(1);

    }
}
