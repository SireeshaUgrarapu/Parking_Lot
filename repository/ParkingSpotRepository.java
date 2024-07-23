package ProjectParkingLot.repository;

import ProjectParkingLot.exception.ParkingSpotNotFoundException;
import ProjectParkingLot.models.ParkingFloor;
import ProjectParkingLot.models.ParkingSpot;

import java.util.HashMap;

public class ParkingSpotRepository {
    private HashMap<Integer, ParkingSpot> parkingSpotMap;
   // private static int idCounter = 0;
    public ParkingSpotRepository(){
        this.parkingSpotMap = new HashMap<>();
    }
    public ParkingSpot get(int parkingSpotId){
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotNotFoundException("ParkingSpot not found "+parkingSpotId);
        }
        return parkingSpot;
    }
    public void put(ParkingSpot parkingSpot){
      //  parkingSpot.setId(++idCounter);
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("ParkingSpot successfully added");
    }
}
