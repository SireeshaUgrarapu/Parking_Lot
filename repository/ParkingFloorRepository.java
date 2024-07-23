package ProjectParkingLot.repository;

import ProjectParkingLot.exception.ParkingLotNotFoundException;
import ProjectParkingLot.models.ParkingFloor;
import ProjectParkingLot.models.ParkingSpot;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorMap;
    //private static int idCounter = 0;
    public ParkingFloorRepository(){
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingLotNotFoundException("Parking Floor not found "+parkingFloorId);
        }
        return parkingFloor;
    }
    public void put(ParkingFloor parkingFloor){
       // parkingFloor.setId(++idCounter);
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("ParkingFloor Successfully Added");
    }
}
