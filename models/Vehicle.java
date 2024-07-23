package ProjectParkingLot.models;

import ProjectParkingLot.models.enums.VehicleType;

import java.time.LocalDateTime;

public class Vehicle extends BaseModel{
    private String number;

    private LocalDateTime entryTime;
    private VehicleType vehicleType;
    private String color;

    public Vehicle() {

    }

    public Vehicle(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, String number, LocalDateTime entryTime, VehicleType vehicleType, String color) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.number = number;
        this.entryTime = entryTime;
        this.vehicleType = vehicleType;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
