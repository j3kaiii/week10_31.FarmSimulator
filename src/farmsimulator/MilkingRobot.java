package farmsimulator;

/**
 *
 * @author j3kaiii
 */
public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot() {
    }
    
    public BulkTank getBulkTank() {
        if (bulkTank != null) {
            return bulkTank;
        }
        return null;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.bulkTank = tank;
    }
    
    public void milk(Milkable milkable) {
        if (bulkTank != null) {
            bulkTank.addToTank(milkable.milk());
            return;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
