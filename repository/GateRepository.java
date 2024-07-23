package ProjectParkingLot.repository;

import ProjectParkingLot.exception.GateNotFoundException;
import ProjectParkingLot.models.Gate;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> gateMap;
   // private static int idCounter = 0;
    public GateRepository(){
        this.gateMap = new HashMap<>();
    }
    public Gate get(int gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("gate not found Exception "+gateId);
        }
        return gate;
    }
    public void put(Gate gate){
      //  gate.setId(++idCounter);
        gateMap.put(gate.getId(), gate);
        System.out.println("Gate Successfully Added");
    }
}
