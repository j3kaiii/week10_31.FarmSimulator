package farmsimulator;

import java.util.Collection;

/**
 *
 * @author j3kaiii
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        robot = new MilkingRobot();
        robot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow) {
        if (robot == null) {
            throw new IllegalStateException();
        } else {
            robot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        if (robot == null) {
            throw new IllegalStateException();
        } else {
            for (Milkable m : cows) {
                robot.milk(m);
            }
        }
    }
    
    public String toString() {
        return "Barn: " + tank;
    }

}
