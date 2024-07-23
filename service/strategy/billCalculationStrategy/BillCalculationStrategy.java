package ProjectParkingLot.service.strategy.billCalculationStrategy;

import ProjectParkingLot.models.Bill;
import ProjectParkingLot.models.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
