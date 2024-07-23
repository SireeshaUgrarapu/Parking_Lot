package ProjectParkingLot.service.strategy.spotAllocationStrategy;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }
}
