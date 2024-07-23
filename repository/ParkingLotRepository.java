package ProjectParkingLot.repository;

import ProjectParkingLot.exception.ParkingLotNotFoundException;
import ProjectParkingLot.models.ParkingLot;

import java.sql.SQLOutput;
import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotMap;
    private static int idCounter = 0;
    public ParkingLotRepository(){
        this.parkingLotMap = new HashMap<>();
    }
    public ParkingLot get(int parkingLotId){
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null){
            throw new ParkingLotNotFoundException("ParkingLot is Invalid"+parkingLotId);
        }

        return parkingLot;
    }
    public void put(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        System.out.println("ParkingLot has been added Successfully");
    }
}
