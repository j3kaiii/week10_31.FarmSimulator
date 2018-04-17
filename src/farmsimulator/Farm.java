package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author j3kaiii
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> herd;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        herd = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow) {
        herd.add(cow);
    }

    public String getOwner() {
        return owner;
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour() {
        for (Cow m : herd) {
            m.liveHour();
        }
    }
    
    public void manageCows() {
        barn.takeCareOf(herd);
    }
    
    public String toString() {
        String cows = "";
        if (herd.isEmpty()) {
            cows = "No cows";
        }
        else {
            cows = "Animals:\n";
            for (Cow cow : herd) {
                cows = cows + "        " + cow + "\n";
            }
        }
        
        return "Farm owner: " + this.owner + "\n"
                + "Barn bulk tank: " + barn.getBulkTank() + "\n"
                +  cows;
        
    }

}
