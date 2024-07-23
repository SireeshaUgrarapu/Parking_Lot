package ProjectParkingLot.models;

import ProjectParkingLot.models.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private Ticket ticket;
    private BillStatus billStatus;
    private double amount;
    private Gate exitgate;

    public Bill() {

    }

    public Bill(int id, LocalDateTime createdAt, LocalDateTime updatedAt, String createdBy, String updatedBy, LocalDateTime exitTime, Ticket ticket, BillStatus billStatus, double amount, Gate exitgate) {
        super(id, createdAt, updatedAt, createdBy, updatedBy);
        this.exitTime = exitTime;
        this.ticket = ticket;
        this.billStatus = billStatus;
        this.amount = amount;
        this.exitgate = exitgate;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Gate getExitgate() {
        return exitgate;
    }

    public void setExitgate(Gate exitgate) {
        this.exitgate = exitgate;
    }
}
