package farmsimulator;

public class Main {
    public static void main(String[] args) {
        //create new farm
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        
        //buy a dairy robot
        MilkingRobot robot = new MilkingRobot();
        
        //install our robot to farm
        farm.installMilkingRobot(robot);

        //buy some cows
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());


        //one hour later
        farm.liveHour();
        //one hour later
        farm.liveHour();

        //milking of all cows
        farm.manageCows();

        System.out.println(farm);
    }
}
