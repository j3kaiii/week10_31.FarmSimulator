package farmsimulator;

/**
 *
 * @author j3kaiii
 */
public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this(2000);
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
        volume = 0.0;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace() {
        return capacity - volume;
    }
    
    public void addToTank(double amount) {
        if (amount < 0) return;
        if (amount < howMuchFreeSpace()) {
            volume = volume + amount;
        } else {
            volume = capacity;
        }
    }
    
    public double getFromTank(double amount) {
        if (amount < 0) return 0.0;
        if (amount > volume) {
            double all = volume;
            volume = 0.0;
            return all;
        }
        volume = volume - amount;
        return amount;
    }
    
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
