package ProjectParkingLot.models;

import ProjectParkingLot.models.enums.GateType;
import ProjectParkingLot.models.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{

    private int floorNumber;
    private ParkingFloorStatus parkingFloorStatus;
    private GateType entryGate;
    private GateType exitGate;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor() {

    }

    public ParkingFloor(int floorNumber, ParkingFloorStatus parkingFloorStatus, GateType entryGate, GateType exitGate, List<ParkingSpot> parkingSpots) {
        this.floorNumber = floorNumber;
        this.parkingFloorStatus = parkingFloorStatus;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public GateType getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(GateType entryGate) {
        this.entryGate = entryGate;
    }

    public GateType getExitGate() {
        return exitGate;
    }

    public void setExitGate(GateType exitGate) {
        this.exitGate = exitGate;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
