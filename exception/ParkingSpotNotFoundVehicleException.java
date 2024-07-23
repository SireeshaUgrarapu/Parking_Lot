package ProjectParkingLot.exception;

public class ParkingSpotNotFoundVehicleException extends  RuntimeException{
    public ParkingSpotNotFoundVehicleException() {
    }

    public ParkingSpotNotFoundVehicleException(String message) {
        super(message);
    }
}
