package ProjectParkingLot.models;

import ProjectParkingLot.models.enums.GateStatus;
import ProjectParkingLot.models.enums.GateType;

import java.time.LocalDateTime;

public class Gate extends BaseModel{
    private int number;
    private GateStatus gateStatus;
    private GateType gateType;
    private String operatorName;

    public Gate() {

    }

    public Gate(int number, GateStatus gateStatus, GateType gateType, String operatorName) {
        this.number = number;
        this.gateStatus = gateStatus;
        this.gateType = gateType;
        this.operatorName = operatorName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
