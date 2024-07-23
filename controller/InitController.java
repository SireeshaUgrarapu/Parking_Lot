package ProjectParkingLot.controller;

import ProjectParkingLot.models.ParkingFloor;
import ProjectParkingLot.models.ParkingLot;
import ProjectParkingLot.service.strategy.InitialisationService;

public class InitController {
private final InitialisationService initialisationService;

    public InitController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }
    public ParkingLot init(){
        return initialisationService.init();
    }
}
