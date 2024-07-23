package ProjectParkingLot.models;

import ProjectParkingLot.models.enums.ParkingSpotStatus;
import ProjectParkingLot.models.enums.VehicleType;

import java.time.LocalDateTime;

public class ParkingSpot extends BaseModel {
    private int number;
    private Vehicle vehicle;
    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType vehicleType;

    public ParkingSpot() {

    }

    public ParkingSpot(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, int number, Vehicle vehicle, ParkingSpotStatus parkingSpotStatus, VehicleType vehicleType) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.number = number;
        this.vehicle = vehicle;
        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicleType = vehicleType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
