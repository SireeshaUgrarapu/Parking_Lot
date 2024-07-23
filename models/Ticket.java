package ProjectParkingLot.models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private Gate entrygate;
    private ParkingSpot parkingSpot;

    public Ticket() {

    }

    public Ticket(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, LocalDateTime entryTime, Vehicle vehicle, Gate entrygate, ParkingSpot parkingSpot) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.entrygate = entrygate;
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntrygate() {
        return entrygate;
    }

    public void setEntrygate(Gate entrygate) {
        this.entrygate = entrygate;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
